package LearningJava.Super_Keyword;

public class Super_Keyword {
    public static void main(String[] args) {

        Person person = new Person("Lily", "Potter");
        Student student = new Student("Harry", "Potter", 95.00);
        Employee employee = new Employee("James", "Potter", 50000);

        person.showName();
        employee.showName();
        student.showName();
        employee.showSalary();
        student.showMarks();
    }
}
