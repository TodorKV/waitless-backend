package com.rest.auth.repository;

import com.rest.auth.entity.consumable_entity.Drink;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {
    
}
