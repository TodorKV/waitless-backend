package com.rest.auth.entity.consumable_entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.rest.auth.entity.Menu;
import com.rest.auth.entity.Review;
import com.rest.auth.model.IsReviewable;

@Entity
public class Drink implements IsReviewable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer did;
    private String name;

    @ManyToMany(mappedBy = "drink")
    private List<Menu> menu = new ArrayList<Menu>();

    @OneToMany(mappedBy = "drink")
    private List<Review> reviews = new ArrayList<Review>();


    public List<Menu> getMenu() {
        return this.menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }


    public Integer getDid() {
        return this.did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenus() {
        return this.menu;
    }

    public void setMenus(List<Menu> menu) {
        this.menu = menu;
    }



}
