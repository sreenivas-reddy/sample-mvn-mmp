package com.jasmin.apps.java.modules.module1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getFirstName() {
        Person person = new Person();
        System.out.println(person.getFirstName());
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastName() {
        Person person = new Person();
        System.out.println(person.getLastName());
    }

    @Test
    public void setLastName() {
    }
}