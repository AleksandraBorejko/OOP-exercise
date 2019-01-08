package com.myburger;

public enum Addition {
    LETTUCE(0.45),
    TOMATO(0.50),
    PICKLES(0.60),
    BECON(2.50),
    RED_ONION(0.55),
    CHEESE(2.00),
    JALAPENO(0.90),
    EXTRA_MEAT(4.00);

    double price;

    Addition(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

