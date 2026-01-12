package LearningJava;

import java.util.Random;

public class Random_Number_Generator {
    public static void main(String[] args) {

        Random random = new Random();

        //int number;
        //double number;
        boolean isHeads;

        //number = random.nextInt(1, 101);
        //number = random.nextDouble();
        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }

        //System.out.println(number);
    }
}
