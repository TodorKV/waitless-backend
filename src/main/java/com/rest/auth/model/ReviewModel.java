package com.rest.auth.model;

import com.rest.auth.entity.Review;
import com.rest.auth.entity.User;

public class ReviewModel {

    private Integer rid;
    private String description;
    private UserModel user;
    private Integer stars;

    public ReviewModel(Review r){
        setDescription(r.getDescription());
        setRid(r.getRid());
        setUser(r.getUser());
        setStars(r.getStars());
    }

    public Integer getRid() {
        return this.rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public UserModel getUser() {
        return this.user;
    }

    public void setUser(User user) {
        System.out.println(user);
        this.user = new UserModel(user);
    }

    public Integer getStars() {
        return this.stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    
}
