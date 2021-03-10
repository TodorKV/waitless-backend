package com.rest.auth.model;

import java.util.ArrayList;
import java.util.List;

import com.rest.auth.entity.Review;
import com.rest.auth.entity.User;

import org.springframework.beans.BeanUtils;

public class UserModel {
    private int id;
    private String email;
    private List<ReviewModel> reviewModels = new ArrayList<ReviewModel>();


    public UserModel(User u){
        setEmail(u.getEmail());
        setId(u.getId());
        // setReviewModels(u.getReview());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ReviewModel> getReviewModels() {
        return this.reviewModels;
    }

    public void setReviewModels(List<Review> reviews) {

        reviews.stream().forEach(r -> {
            System.out.println(r);
            Review review = new Review();
            BeanUtils.copyProperties(r, review);
            ReviewModel rm = new ReviewModel(review);
            this.reviewModels.add(rm);
        });
    }


}
