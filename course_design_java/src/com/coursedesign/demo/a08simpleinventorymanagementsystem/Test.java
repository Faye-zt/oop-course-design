package com.coursedesign.demo.a08simpleinventorymanagementsystem;

public class Test {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "手机", 1000.0));
        manager.addProduct(new Product(2, "电脑", 5000.0));
        manager.addProduct(new Product(3, "鼠标", 20.0));

        manager.displayAllProducts();

        Product find = manager.findProductById(2);
        if(find != null){
            System.out.println("找到商品：" + find.toString());
        }

    }
}
