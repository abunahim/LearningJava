package LearningJava.OOP;

public class Car {

    String make = "Nissan";
    String model = "GTR";
    int year = 1998;
    double price = 1999.99;
    boolean isRunning = true;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }
    void drive(){
        System.out.println("You drive the " + model);
    }
    void brake(){
        System.out.println("You brake the " + model);
    }
}
