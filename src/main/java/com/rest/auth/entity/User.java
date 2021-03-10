package com.rest.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;


@Entity
public class User {
    
    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "user")
    private List<Review> review = new ArrayList<Review>();

    public String email;
    public String password;


    public List<Review> getReview() {
        return this.review;
    }

    public void setReview(List<Review> review) {
        this.review = review;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
