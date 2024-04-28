package com.jasmin.apps.java.modules.module2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void getModel() {
        Car car = new Car();
        System.out.println(car.getModel());
    }

    @Test
    public void setModel() {
    }

    @Test
    public void getMileage() {
        Car car = new Car();
        System.out.println(car.getMileage());
    }

    @Test
    public void setMileage() {
    }
}