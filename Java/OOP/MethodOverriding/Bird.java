package LearningJava.Method_Overriding;

public class Bird extends Animal{

    @Override
    void move() {
        System.out.println("This animal is flying");
    }
}
