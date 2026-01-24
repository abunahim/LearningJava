package LearningJava.Method_Overriding;

public class Method_Overriding {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        cat.move();
        dog.move();
        bird.move();
        fish.move();
    }
}
