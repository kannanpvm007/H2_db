package com.kgisl.springtst.repository;

import com.kgisl.springtst.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Integer> {

    
}