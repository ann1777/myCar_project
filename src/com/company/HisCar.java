package com.company;

public class HisCar implements CarInterface {
    @Override
    public String gas(int I) {
        return "HisCar: gas " + I;
    }

    @Override
    public String brake(int I) {
        return "HisCar: brake " + I;
    }

    @Override
    public String description() {
        return "HisCar: description";
    }
}
