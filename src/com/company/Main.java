package com.company;

public class Main {
    public static void main(String[] args) {
        MyCar myCar = new MyCar();
        myCar.color = "red";
        myCar.speed = 120;
        myCar.model = "Antilopa";
        System.out.println(myCar.gas(5));
        System.out.println(myCar.brake(10));
        System.out.println(myCar.description());
        HisCar anotherCar = new HisCar();
        System.out.println(anotherCar.gas(5));
        System.out.println(anotherCar.brake(10));
        System.out.println(anotherCar.description());

    }


}









