package com.kgisl.springtst.Controller;

import java.util.List;

import com.kgisl.springtst.entity.Car;
import com.kgisl.springtst.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CarController
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/")
    public List<Car> getall() {
        System.out.println(carRepository.findAll());
        return carRepository.findAll();
    }




    }
