package org.example;

public class Mercedes extends Car{
    private int maxSpeed;

    public Mercedes(String model, double power, int year,String color,int maxSpeed) {
        super(model, power, year,color);
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                "\nPower: "+getPower()+
                "\nYear: "+getYear()+
                "\nColor: "+getColor()+
                "\nMaxSpeed: "+getMaxSpeed());

    }
}
