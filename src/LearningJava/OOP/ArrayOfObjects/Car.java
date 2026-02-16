package LearningJava.Array_Of_Objects;

public class Car {

    String model;
    String colour;

    Car(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    void drive(){
        System.out.println("You drive this " + this.colour + " " + this.model);
    }
}
