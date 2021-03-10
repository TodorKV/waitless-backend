package com.rest.auth.repository;

import com.rest.auth.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer>{
    
}
