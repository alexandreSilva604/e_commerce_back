package com.example.e_commerce_back;

public class Product {

    private final long id;
    private final double price;
    private final String name, category, imagePath;

    public Product(long id, double price, String name, String category, String imagePath) {

        this.id = id;
        this.price = price;
        this.name = name;
        this.category = category;
        this.imagePath = imagePath;
    }

    public Product() {

        this.id = 0;
        this.price = 0;
        this.name = "";
        this.category = "";
        this.imagePath = "";
    }

    public long getId() {
        return this.id;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public String getImagePath() {
        return this.imagePath;
    }
}
