package com.java21days;

public class Comic {
    String title;
    String issue;
    String condition;
    float originalPrice;
    float finalPrice;

    Comic(String title, String issue, String condition, float originalPrice){
        this.title = title;
        this.issue = issue;
        this.condition = condition;
        this.originalPrice = originalPrice;
    }

    void setFinalPrice(float finalPrice){
        this.finalPrice = finalPrice;
    }
}
