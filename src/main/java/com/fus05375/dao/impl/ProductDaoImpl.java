package com.fus05375.dao.impl;

import com.fus05375.dao.ProductDao;
import com.fus05375.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;  //singletonPattern



    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(product);
        session.flush();  //executed
    }

    public Product getProductById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class,id);
        session.flush();


        return product;
    }

    public List<Product> getAllProduct() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> products = query.list();
        session.flush();

        return products;
    }

    public void deleteProduct(String id) {
        Session session = sessionFactory.getCurrentSession();

        session.delete(getProductById(id));
        session.flush();  //executed

    }
}
