package org.example.model;

public class Chocolate extends ProductForSale{
    private String color;
    private boolean hasSugar;



    public Chocolate(String type, double price, String description, boolean hasSugar, String color) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.color = color;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                ", hasSugar=" + hasSugar +
                '}';
    }
}
