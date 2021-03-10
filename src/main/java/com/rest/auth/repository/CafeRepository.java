package com.rest.auth.repository;

import com.rest.auth.entity.Cafe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CafeRepository extends JpaRepository<Cafe, Integer> {
    
}
