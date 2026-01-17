package LearningJava;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) throws InterruptedException {

        /*for(int i = 1; i < 20; i+=5){
            System.out.println(i);
        }*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.print("How many times do you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i <= max; i++){
            System.out.println(i);
        }*/

        System.out.print("How many seconds to countdown: ");
        int start = scanner.nextInt();

        for(int i = start; i >= 1; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");

        scanner.close();
    }
}
