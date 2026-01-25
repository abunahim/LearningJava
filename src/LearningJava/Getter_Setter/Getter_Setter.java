package LearningJava.Getter_Setter;

public class Getter_Setter {
    public static void main(String[] args) {

        Car car = new Car("GTR", "Blue", 2000);

        /*car.setColour("Red");
        car.setPrice(0);*/

        System.out.println(car.getColour() + " " + car.getModel() + " for " + car.getPrice());
    }
}
