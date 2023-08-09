package org.example;

public class Main {
    public static void main(String[] args) {
      Printable toyota =  createObject("Toyota");
      Printable mercedes = createObject("Mercedes");
      Printable audi =  createObject("Audi");

       Printable[] printables = {toyota,mercedes,audi};
        for (int i = 0; i < printables.length; i++) {
                 printables[i].print();
            System.out.println("_____________");
        }


    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Toyota":
                return new Toyota("Toyota Tundra", 5.7, 2021, "White",122);
            case "Mercedes":
                return new Mercedes("Mercedes Benz AMG GT", 4.0, 2018, "Yellow",318);
            case "Audi":
                return new Audi("Audi RS5", 2.9, 2019,"Red",2 );
            default:
                return null;
        }
    }

}
