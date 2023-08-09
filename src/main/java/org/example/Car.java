package org.example;

public abstract class Car implements  Printable {
    private String model;
    private double power;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Car(String model, double power, int year, String color) {
        this.model = model;
        this.power = power;
        this.year = year;
        this.color=color;
    }
}
