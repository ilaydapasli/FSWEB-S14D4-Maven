package org.example.model;

public abstract class ProductForSale {
private String type;
private int price;
private String description;


    protected ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    int getSalesPrice(int quantity) {
        return quantity*price;
    }
}
