package com.rest.auth.repository;

import com.rest.auth.entity.Menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    
}
