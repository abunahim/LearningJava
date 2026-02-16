package LearningJava;

public class Methods {
    public static void main(String[] args) {

        /*String name = "me";
        int age = 50;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);*/

        /*double result = square(3);
        System.out.println(result);
        System.out.println(square(3));*/

        //System.out.println(cube(5));

        /*String fullname = getFullName("Donald", "Duck");
        System.out.println(fullname);*/

        int age = 17;

        if(ageCheck(age)){
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You need to be 18+ to be eligible");
        }

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to " + name);
        System.out.println("Happy Birthday dear " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Happy Birthday to you");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String firstname, String lastname){
        return firstname + " " + lastname;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
