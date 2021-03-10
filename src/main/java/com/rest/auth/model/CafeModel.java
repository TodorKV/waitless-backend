package com.rest.auth.model;

import java.util.List;


public class CafeModel {

    private String name;
    private List<FoodModel> menuFoods;
    private List<DrinkModel> menuDrinks;

    public CafeModel() {}

    public CafeModel(CafeModel cc){
        setMenuDrinks(cc.getMenuDrinks());
        setName(cc.getName());
        setMenuFoods(cc.getMenuFoods());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FoodModel> getMenuFoods() {
        return this.menuFoods;
    }

    public void setMenuFoods(List<FoodModel> menuFoods) {
        this.menuFoods = menuFoods;
    }

    public List<DrinkModel> getMenuDrinks() {
        return this.menuDrinks;
    }

    public void setMenuDrinks(List<DrinkModel> menuDrinks) {
        this.menuDrinks = menuDrinks;
    }

    
}
