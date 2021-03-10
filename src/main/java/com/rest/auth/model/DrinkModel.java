package com.rest.auth.model;

import com.rest.auth.entity.consumable_entity.Drink;

import java.util.*;

public class DrinkModel {
    
    private Integer Id;
    private String name;

    private List<ReviewModel> reviewModels;

    public DrinkModel() {}

    public DrinkModel(Drink drink){
        setId(drink.getDid());
        setName(drink.getName());
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public List<ReviewModel> getReviewModels() {
        return this.reviewModels;
    }

    public void setReviewModels(List<ReviewModel> reviewModels) {
        this.reviewModels = reviewModels;
    }

}
