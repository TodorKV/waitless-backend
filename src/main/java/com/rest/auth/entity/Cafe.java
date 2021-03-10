package com.rest.auth.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cafe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cid;
    private String name;

    @OneToOne
    private Menu menu;


    public Integer getCid() {
        return this.cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


}
