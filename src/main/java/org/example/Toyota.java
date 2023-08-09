package org.example;

public class Toyota extends Car{
    private int LargeFuelTankCapacity;

    public Toyota(String model, double power, int year,String color, int LargeFuelTankCapacity) {
        super(model, power, year,color);
        this.LargeFuelTankCapacity = LargeFuelTankCapacity;
    }

    public int getLargeFuelTankCapacity() {
        return LargeFuelTankCapacity;
    }

    @Override
    public void print() {
        System.out.println("Model: "+getModel()+
                           "\nPower: "+getPower()+
                           "\nYear: "+getYear()+
                           "\nColor: "+getColor()+
                           "\nLargeFuelTankCapacity: "+getLargeFuelTankCapacity());

    }
}
