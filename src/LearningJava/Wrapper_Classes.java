package LearningJava;

public class Wrapper_Classes {
    public static void main(String[] args) {

        /*//AUTOBOXING
        Integer a = 123;
        Double b = 3.14;
        Character c = '£';
        Boolean d = true;

        //UNBOXING
        int w = a;
        double x = b;
        char y = c;
        boolean z = d;*/

        /*//primitive data to string
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('£');
        String d = Boolean.toString(true);

        String x = a + b + c + d;
        System.out.println(x);*/

        //string to primitives data
        /*int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");*/

        char letter = 'n';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
