package com.example.web.entity;

/**
 * Created by Zhaixiangyang on 2018/8/23-023.
 */

public class Product {
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    private String id;
    private String name;
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
