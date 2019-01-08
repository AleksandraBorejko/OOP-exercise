package com.myburger;

public class CheeseBurger extends Hamburger {
    private Addition cheese;


    public CheeseBurger(String name, double price, String meat, String breadRollType) {
        super(name, price, meat, breadRollType);
        this.cheese = Addition.CHEESE;
    }


    @Override
    public double getPrice() {
        double hamburgerPrice = super.getPrice();

        hamburgerPrice += cheese.getPrice();
        System.out.println("Added " + cheese.toString() + " for an extra: " + cheese.getPrice() + "$");

        return hamburgerPrice;
    }
}
