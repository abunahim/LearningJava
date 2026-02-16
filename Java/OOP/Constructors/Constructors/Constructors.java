package LearningJava.Constructors;

public class Constructors {
    public static void main(String[] args) {
        Student student1 = new Student("Batman", 30, 99.00);
        Student student2 = new Student("Superman", 28, 95.00);
        Student student3 = new Student("Aquaman", 33, 80.00);

        /*System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.marks);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.marks);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.marks);
        System.out.println(student3.isEnrolled);*/

        student1.study();
        student2.study();
        student3.study();
    }
}
