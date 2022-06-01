package myapp.core;

public class Main {

    public static void main (String[] args){
        //Instantiate a car
        Car myCar = new Car();
        myCar.setColour("red");
       // myCar.colour = "red";
        //myCar.make = "honda";
        //myCar.engineCapacity = 2000;

        myCar.start();
        System.out.printf("the colour of my car is %s\n", myCar.getColour());
        //Instantiate another car, my Ca

        Car herCar = new Car();
        myCar.setColour("blue");
        //herCar.colour = "yellow";
        //herCar.make = "toyota";
        //herCar.engineCapacity = 2500;

        herCar.stop();
        System.out.printf("the colour of my car is %s\n", herCar.getColour());

        //Honda
        Honda civic = new Honda();
        System.out.printf("Make of car: %s\n", civic.getMake());
        civic.accelerate();
        civic.stop();
        civic.stop(30);




    }
    
}
