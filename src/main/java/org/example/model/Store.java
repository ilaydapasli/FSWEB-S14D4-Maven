package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[]products=new ProductForSale[5];
        //listProducts();
        products[0]=new Chocolate("sfsdf",56,"sdşkfsmdf",true,"sdaasd");
    }

    public static void listProducts(ProductForSale[] products) {
    for (ProductForSale product:products){
        if (product!=null){
            product.showDetails();
        }
    }
    }
}