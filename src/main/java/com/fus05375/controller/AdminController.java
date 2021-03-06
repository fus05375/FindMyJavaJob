package com.fus05375.controller;


import com.fus05375.dao.ProductDao;
import com.fus05375.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AdminController {

    private Path path;

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @RequestMapping("/admin/productInventory")
    public String productInventory(Model model) {
        List<Product> products = productDao.getAllProduct();
        model.addAttribute("products", products);
        return "productInventory";
    }

    @RequestMapping("/admin/productInventory/addProduct")
    public String addProduct(Model model) {
        Product product = new Product();
        product.setProductCategory("Beginer");
        product.setProductStatus("active");

        model.addAttribute("product", product);

        return "addProduct";
    }

    @RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
    public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request) {
        //if result detects error, it would return to editProduct page

        if(result.hasErrors()){
            return "addProduct";
        }
        productDao.addProduct(product);
        MultipartFile productImage = product.getProductImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + product.getProductID() + ".png");


        if(productImage != null && !productImage.isEmpty()){
            try{
                productImage.transferTo(new File(path.toString())); //saves the image to this directory path and saves to new type .png file
            } catch(Exception e){
                e.printStackTrace();
                throw new RuntimeException("Product image saving failed.", e);
            }
        }
        return "redirect:/admin/productInventory"; //Redirecting to a different path -- can't just put productInventory because modeling hasn't been done for the added object
    }   //Redirect tells the controller that this is not a JSP page but it is a pathname

    @RequestMapping("/admin/productInventory/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable String productId, Model model, HttpServletRequest request) {

        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" + productId + ".png");

        if(Files.exists(path)){
            try{
                Files.delete(path);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        productDao.deleteProduct(productId);


        return "redirect:/admin/productInventory";
    }

    @RequestMapping("/admin/productInventory/editProduct/{productId}")
    public String editProduct(@PathVariable("productId") String productId, Model model){
        Product product = productDao.getProductById(productId);

        model.addAttribute(product);


        return "editProduct" ;
    }


    @RequestMapping(value = "/admin/productInventory/editProduct", method = RequestMethod.POST)
    public String editProduct( @Valid @ModelAttribute("product") Product product, Model model,BindingResult result, HttpServletRequest request){

        if(result.hasErrors()){
            return "editProduct";
        }

        MultipartFile productImage = product.getProductImage();
        String rootDirectiry= request.getSession().getServletContext().getRealPath("/");
        path=Paths.get(rootDirectiry + "\\WEB-INF\\resources\\images\\" +product.getProductID()+".png" );


        if(productImage != null && !productImage.isEmpty()){
            try{
                productImage.transferTo(new File(path.toString()));
            } catch (Exception e) {
                throw new RuntimeException("Product image saving failed, "+ e);
            }
        }

        productDao.editProduct(product);
        return "redirect:/admin/productInventory";
    }

}
