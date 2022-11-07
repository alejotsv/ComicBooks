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

    }

}
