package LearningJava.Anonymous_Classes;

public class Anonymous_Classes {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby doo says Ruh Roh");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}
