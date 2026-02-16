package LearningJava;

public class Overloaded_Methods {
    public static void main(String[] args) {

        //System.out.println(add(1, 2, 3, 4));

        String meal = comboMeal("cheeseburger", "fries", "coke");
        System.out.println(meal);

    }
    /*static double add(double num1, double num2){
        return num1 + num2;
    }
    static double add(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    static double add(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }*/

    static String comboMeal(String burger){
        return burger + " meal";
    }
    static String comboMeal(String burger, String sides){
        return burger + " & " + sides + " meal";
    }
    static String comboMeal(String burger, String sides, String drink){
        return burger + ", " + sides + " & " + drink + " meal";
    }
}
