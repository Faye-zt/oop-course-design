package com.coursedesign.demo.a08simpleinventorymanagementsystem;

public class Product {
    private int id;
    private String name;
    private Double price;

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = 0.0;
    }

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{id =" + id + ", name =" + name + ", price =" + price + "}";
    }
}
