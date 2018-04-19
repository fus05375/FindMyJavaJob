package com.fus05375.dao;

import com.fus05375.model.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProduct();

    void deleteProduct(String id);

    void editProduct(Product product);

}
