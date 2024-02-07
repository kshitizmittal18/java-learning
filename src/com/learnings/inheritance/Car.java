package com.learnings.inheritance;

public class Car {
    int seats = 4;
    public void speed() {
        System.out.println("Car has max speed of 140 km/h...");
    }
    public void getWheelNumber() {
        System.out.println("Car has 4 wheels...");
    }
    String fuelType = "Petro/Diesel";
}
class DragCar extends Car {
    int seats = 1;
    String fuelType = "Jet Engine Fuel";
    public void speed() {
        System.out.println("DragCar has max speed of 500 km/h...");
    }
}

class Display {
    public static void main(String[] args){
        DragCar dc = new DragCar();
        dc.getWheelNumber();
        dc.speed();
        System.out.println("Seats "+dc.seats);
        System.out.println("Fuel is "+dc.fuelType);


        Car c1 = new DragCar();
        c1.getWheelNumber();
        c1.speed(); // priority is given to object in case of overridden method
        System.out.println("Seats "+c1.seats); // priority is given to reference in case of variable
        System.out.println("Fuel is "+c1.fuelType); // priority is given to reference in case of variable
    }
}
