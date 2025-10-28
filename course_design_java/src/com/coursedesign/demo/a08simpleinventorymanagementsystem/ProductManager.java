package com.coursedesign.demo.a08simpleinventorymanagementsystem;

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> productlist;

    public ProductManager() {
        this.productlist = new ArrayList<>();
    }

    public void addProduct(Product product){
        productlist.add(product);
    }

    public Product findProductById(int id){
        for (Product product : productlist) {
            if(id == product.getId()){
                return product;
            }
        }
        return null;
    }

    public void displayAllProducts(){
        for (Product product : productlist) {
            System.out.println(product.toString());
        }
    }
}
