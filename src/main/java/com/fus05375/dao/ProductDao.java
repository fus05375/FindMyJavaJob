package com.fus05375.dao;

import com.fus05375.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1=new Product();
        product1.setJobName("Java Intern");
        product1.setJobCategory("Developer");
        product1.setJobDescription("Looking for junior developers who are able to develop simple webservice.");
        product1.setJobSalary(3000);
        product1.setJobCondition("new");
        product1.setJobStatus("Active");
        product1.setJobManufacturer("F.U.S.");
        product1.setNoOfCandidates(5);

        Product product2=new Product();
        product2.setJobName("Java Tester");
        product2.setJobCategory("Tester");
        product2.setJobDescription("Looking for junior developers who are able to develop simple webservice.");
        product2.setJobSalary(2000);
        product2.setJobCondition("new");
        product2.setJobStatus("Active");
        product2.setJobManufacturer("F.U.S.");
        product2.setNoOfCandidates(2);

        Product product3=new Product();
        product3.setJobName("Java Analyst/Developer");
        product3.setJobCategory("IT");
        product3.setJobDescription("Are you a passionated Java Analyst / Developer and looking for an environment where you get the opportunity to develop further your talents? Do you see educations as an imporant asset and does the world of consultancy appeal to you? Do you have on top minimum 2 years of relevant experience? \n" +
                "\n" +
                "Then you’re the Java Analyst / Developer we’re looking for! Depending on your knowledge and experience, your tasks can consist of development and/ or technical analysis of all sorts of customer customized applications.");
        product3.setJobSalary(5000);
        product3.setJobCondition("new");
        product3.setJobStatus("Active");
        product3.setJobManufacturer("F.U.S.");
        product3.setNoOfCandidates(1);


        productList=new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    return productList;
    }
}
