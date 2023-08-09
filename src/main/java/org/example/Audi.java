package org.example;

public class Audi extends Car{
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public Audi(String model, double power, int year,String color, int numberOfDoors) {
        super(model, power, year,color);
        this.numberOfDoors=numberOfDoors;
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nPower: "+getPower()+
                "\nYear: "+getYear()+
                "\nColor: "+getColor()+
                "\nNumberOfDoors: "+getNumberOfDoors());

    }
}
