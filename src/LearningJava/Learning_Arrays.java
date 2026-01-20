package LearningJava;

import java.util.Arrays;

public class Learning_Arrays {
    public static void main(String[] args) {

        String[] foods = {"pizza", "ice cream", "burgers", "milkshake"};

        //foods[3] = "coffee";
        //System.out.println(foods[3]);

        //int numOfFoods = foods.length;
        //System.out.println(numOfFoods);

        /*for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }*/

        Arrays.sort(foods);
        //Arrays.fill(foods, "coffee");

        for(String food : foods){
            System.out.println(food);
        }
    }
}
