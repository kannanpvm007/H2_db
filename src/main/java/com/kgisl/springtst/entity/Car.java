package com.kgisl.springtst.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Car
 */
@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}