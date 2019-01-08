package com.myburger;

public class Test {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Hamburger", 5.60, "Beef", "White");
        hamburger.addSauce(Sauce.BBQ);
        hamburger.getTotalPrice();

        CheeseBurger cheese = new CheeseBurger("Cheeseburger", 6.5, "Beef", "White");
        cheese.addAddition(Addition.BECON);
        cheese.addSauce(Sauce.GARLIC);
        cheese.getTotalPrice();

        DoubleTrouble doubleTrouble = new DoubleTrouble("Double Trouble", 7.0, "Chicken", "Graham");
        doubleTrouble.addAddition(Addition.JALAPENO);
        doubleTrouble.addSauce(Sauce.GARLIC);
        doubleTrouble.addSauce(Sauce.HOT);
        doubleTrouble.getTotalPrice();

        VegeBurger vegeBurger = new VegeBurger("Vege", 6.00, "Graham");
        vegeBurger.addAddition(Addition.CHEESE);
        vegeBurger.addSauce(Sauce.MANGO);
        vegeBurger.getTotalPrice();

    }
}
