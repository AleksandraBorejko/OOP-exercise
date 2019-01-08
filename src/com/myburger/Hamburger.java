package com.myburger;

import java.text.DecimalFormat;

public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;
    private Addition lettuce;
    private Addition tomato;
    private Addition pickles;
    private Addition addition;
    private Sauce sauce;

    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.lettuce = Addition.LETTUCE;
        this.tomato = Addition.TOMATO;
        this.pickles = Addition.PICKLES;
    }

    public void addAddition(Addition addition) {
        this.addition = addition;
    }

    public void addSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public double getPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " on a " + this.breadRollType.toLowerCase() + " roll "
                + "with " + this.meat.toLowerCase() + ", price is: " + this.price + "$");

        hamburgerPrice += lettuce.getPrice();
        System.out.println("Added " + lettuce.toString() + " for an extra: " + lettuce.getPrice() + "$");
        hamburgerPrice += tomato.getPrice();
        System.out.println("Added " + tomato.toString() + " for an extra: " + tomato.getPrice() + "$");
        hamburgerPrice += pickles.getPrice();
        System.out.println("Added " + pickles.toString() + " for an extra: " + pickles.getPrice() + "$");

        if (this.addition != null) {
            hamburgerPrice += this.addition.getPrice();
            System.out.println("Added " + this.addition + " for an extra: " + this.addition.getPrice() + "$");
        }
        if (this.sauce != null) {
            hamburgerPrice += this.sauce.getPrice();
            System.out.println("Added " + this.sauce + " sauce for an extra: " + this.sauce.getPrice() + "$");
        }

        return hamburgerPrice;
    }

    public void getTotalPrice() {
        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("\nTotal price is: " + df2.format(getPrice()) + "$");
        System.out.println("###############################################\n");
    }


}
