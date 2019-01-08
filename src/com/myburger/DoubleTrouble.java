package com.myburger;

public class DoubleTrouble extends Hamburger {
    private Addition extraMeat;
    private Addition becon;
    private Sauce sauce;

    public DoubleTrouble(String name, double price, String meat, String breadRollType) {
        super(name, price, meat, breadRollType);
        this.extraMeat = Addition.EXTRA_MEAT;
        this.becon = Addition.BECON;
    }

    @Override
    public double getPrice() {
        double hamburgerPrice = super.getPrice();

        hamburgerPrice += extraMeat.getPrice();
        System.out.println("Added " + extraMeat.toString() + " for an extra: " + extraMeat.getPrice() + "$");
        hamburgerPrice += becon.getPrice();
        System.out.println("Added " + becon.toString() + " for an extra: " + becon.getPrice() + "$");

        if (this.sauce != null) {
            hamburgerPrice += this.sauce.getPrice();
            System.out.println("Added " + this.sauce.toString() + " sauce for an extra: " + this.sauce.getPrice() + "$");
        }

        return hamburgerPrice;
    }
}
