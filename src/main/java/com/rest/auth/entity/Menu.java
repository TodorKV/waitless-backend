package com.rest.auth.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.rest.auth.entity.consumable_entity.Drink;
import com.rest.auth.entity.consumable_entity.Food;

@Entity
public class Menu {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mid;

    private String name;

    @ManyToMany
    @JoinTable(name = "food_menu", joinColumns = @JoinColumn(name = "food_fid"), inverseJoinColumns = @JoinColumn(name = "menu_mid"))
    private List<Food> food = new ArrayList<Food>();

    @ManyToMany
    @JoinTable(name = "drink_menu", joinColumns = @JoinColumn(name = "drink_did"), inverseJoinColumns = @JoinColumn(name = "menu_did"))
    private List<Drink> drink = new ArrayList<Drink>();

  


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getMid() {
        return this.mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public List<Food> getFoods() {
        return this.food;
    }

    public void setFoods(List<Food> food) {
        this.food = food;
    }

    public List<Drink> getDrinks() {
        return this.drink;
    }

    public void setDrinks(List<Drink> drink) {
        this.drink = drink;
    }

}