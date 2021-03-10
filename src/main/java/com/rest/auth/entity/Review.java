package com.rest.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.rest.auth.entity.consumable_entity.*;

@Entity
public class Review {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rid;      

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drink;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private String description;
    private Integer stars;

    public Integer getRid() {
        return this.rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Drink getDrink() {
        return this.drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Food getFood() {
        return this.food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getStars() {
        return this.stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

}   
