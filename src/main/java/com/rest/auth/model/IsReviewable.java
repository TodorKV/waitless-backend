package com.rest.auth.model;

import java.util.List;

import com.rest.auth.entity.Review;

public interface IsReviewable {
    List<Review> getReviews();    
}
