package LearningJava.Abstraction;

public abstract class Shape {

    abstract double area(); //abstract method

    void display(){ //concrete method
        System.out.println("This is a Shape");
    }
}
