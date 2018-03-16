package com.fus05375.controller;

import com.fus05375.dao.ProductDao;
import com.fus05375.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){  //model attached to the view automatically

        List<Product> products = productDao.getProductList();
        model.addAttribute("products", products);

        return "productList";
    }
}
