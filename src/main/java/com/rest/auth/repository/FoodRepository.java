package com.rest.auth.repository;

import com.rest.auth.entity.consumable_entity.Food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends JpaRepository<Food, Integer>{
    
}
