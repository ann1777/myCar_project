package com.company;

public abstract class Car implements CarInterface {
    String model;
    int speed;
    String color;

    public String gas(int I) {
        return "gas " + I;
    }

    public String brake(int I) {
        return "brake " + I;
    }
    public abstract String description();



}


