package com.endava.spring_c3_e2.entities;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private int idproduct;
    private String name;

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
