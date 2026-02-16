package LearningJava.Constructors;

public class Student {
    String name;
    int age;
    double marks;
    boolean isEnrolled;

    Student(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
