package com.myburger;


public enum Sauce {
    KETCHUP(0.30),
    MUSTARD(0.60),
    MAYONNAISE(0.70),
    BBQ(0.50),
    MANGO(0.65),
    GARLIC(0.50),
    HOT(0.70),
    EXTRA_HOT(0.90);

    double price;

    Sauce(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
