package com.fus05375.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productID;

    @NotEmpty(message = " Name must not be null.")
    public String productName;
    private String productCategory;
    private String productDescription;
    @Min(value = 0,message = " Price must be more than zero.")
    private double productPrice;
    private String productStatus;

    private String productManufacturer;

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }

    @Transient
    private MultipartFile productImage; //a representation of an uploaded file received in a multipart request



    //Getters and setters
    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }


    public String getProductManufacturer() {
        return productManufacturer;
    }
    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }


}