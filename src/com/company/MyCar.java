package com.company;

public class MyCar extends Car{
    @Override
    public String description() {
        return "model: " + model+ ", speed: "+ speed+ ", color: "+ color;

    }
}
