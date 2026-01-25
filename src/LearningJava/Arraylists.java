package LearningJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylists {
    public static void main(String[] args) {

        /*ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(5);

        System.out.println(list);*/

        /*ArrayList<Double> list = new ArrayList<>();

        list.add(3.14);
        list.add(6.56);
        list.add(5.99);

        System.out.println(list);*/

        /*ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Coconut");*/

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        //System.out.println(fruits);
        //System.out.println(fruits.get(2));
        //System.out.println(fruits.size());

        /*Collections.sort(fruits);

        //System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }*/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();

        System.out.print("Enter the # of Vegetables you would like to enter: ");
        int numOfFruit = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFruit; i++){
            System.out.print("Enter fruit #" + i + ": ");
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }
        System.out.println(fruits);

        scanner.close();
    }
}
