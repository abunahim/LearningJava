package LearningJava.Array_Of_Objects;

public class Array_Of_Objects {
    public static void main(String[] args) {

        /*Car car1 = new Car("GTR", "Blue");
        Car car2 = new Car("Charger", "Red");
        Car car3 = new Car("Mustang", "Black");

        Car[] cars = {car1, car2, car3};

        for(int i = 0; i < cars.length; i++){
            cars[i].drive();
        }*/

        Car[] cars = {new Car("GTR", "Blue"),
                      new Car("Charger", "Red"),
                      new Car("Mustang", "Black")};

        for(Car car : cars){
            //car.drive();
            car.colour = "Yellow";
        }
        for(Car car : cars){
            car.drive();
        }
    }
}
