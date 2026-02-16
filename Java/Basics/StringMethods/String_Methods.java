package LearningJava;

public class String_Methods {
    public static void main(String[] args) {

        String name = "nahim";

        /*int length = name.length();
        char letter = name.charAt(3);
        //int index = name.indexOf("m");
        int index = name.lastIndexOf("a");*/

        /*System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(index);*/

        /*name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("N", "f");*/

        //System.out.println(name);

        /*if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name doesn't contain a space");
        }*/

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
