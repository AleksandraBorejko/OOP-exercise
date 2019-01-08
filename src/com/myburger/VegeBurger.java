package com.myburger;

public class VegeBurger extends Hamburger {
    private Addition onion;


    public VegeBurger(String name, double price, String breadRollType) {
        super(name, price, "Vegetarian", breadRollType);
        this.onion = Addition.RED_ONION;
    }

    @Override
    public double getPrice() {
        double hamburgerPrice = super.getPrice();

        hamburgerPrice += onion.getPrice();
        System.out.println("Added " + onion.toString() + " for an extra: " + onion.getPrice() + "$");

        return hamburgerPrice;
    }
}
