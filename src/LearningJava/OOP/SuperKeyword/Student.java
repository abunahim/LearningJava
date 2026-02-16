package LearningJava.Super_Keyword;

public class Student extends Person{

    double marks;

    Student(String first, String last, double marks){
        super(first, last);
        this.marks = marks;
    }

    void showMarks(){
        System.out.println(this.first + "'s marks are " + marks);
    }
}
