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
public class Food implements IsReviewable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer fid;

    private String name;

    @ManyToMany(mappedBy = "food")
    private List<Menu> menu = new ArrayList<Menu>();

    @OneToMany(mappedBy = "food")
    private List<Review> reviews = new ArrayList<Review>();


    public Food(){}


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


    public Integer getFid() {
        return this.fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
