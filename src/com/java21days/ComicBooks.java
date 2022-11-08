package com.java21days;

import java.util.HashMap;

public class ComicBooks {

    public ComicBooks() {
    }

    public static void main(String[] args) {
//        set up hash map
        HashMap quality = new HashMap();
        String[] condition = { "mint", "near mint", "very fine", "fine", "good", "poor" };
        float[] prices = { 3.00F, 2.00F, 1.50F, 1.00F, 0.50F, 0.25F };
        for(int i=0; i<condition.length; i++) {
            quality.put(condition[i], prices[i]);
        }

        Comic[] comix = new Comic[3];

        comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine", 12_000.00F);
        comix[1] = new Comic("Incredible Hulk", "181", "near mint", 680.00F);
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);

        int length = comix.length;

        for(int i=0; i<length; i++){
            float price = (Float) quality.get(comix[i].condition);
            comix[i].setFinalPrice(price);
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue number: " + comix[i].issue);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: " + comix[i].finalPrice);
            System.out.println("-------------------------");
        }


    }

}
