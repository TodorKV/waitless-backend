package com.rest.auth.model;

import java.util.List;

import com.rest.auth.entity.consumable_entity.Food;

public class FoodModel {

    private Integer Id;
    private String name;

    private List<ReviewModel> reviewModels;

    public FoodModel() {}

    public FoodModel(Food food){
        setId(food.getFid());
        setName(food.getName());
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
