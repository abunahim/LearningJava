package LearningJava;

import java.util.Scanner;

public class Math_Class {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //double result;

        //result = Math.pow(2, 4);
        //result = Math.abs(-5);
        //result = Math.sqrt(9);
        //result = Math.round(1.51);
        //result = Math.ceil(1.10);
        //result = Math.floor(1.99);
        //result = Math.max(1, 9);
        //result = Math.min(4, 10);

        //System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        /*double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse of (Side C) is " + c + "cm");*/


        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference + "cm");

        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area + "cm²");

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume: " + volume + "cm³");

        scanner.close();
    }
}
