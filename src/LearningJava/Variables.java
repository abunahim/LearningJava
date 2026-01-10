package LearningJava;

public class Variables {
    public static void main(String[] args){

        int age = 27;
        int year = 1998;

        double price = 1999.99;
        double temperature = -4.5;

        char grade = 'A';
        char symbol = '@';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;

        String name = "Nahim";
        String car = "GTR";
        String food = "Pizza";
        String colour = "Black";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your choice of car is a " + year + " " + colour + " " + car);
        System.out.println("The price is " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }

    }
}
