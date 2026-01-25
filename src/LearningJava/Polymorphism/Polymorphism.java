package LearningJava.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike,boat};

        /*car.go();
        bike.go();
        boat.go();*/

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
