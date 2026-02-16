package LearningJava.Generics;

public class Generics {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setItem("Apple");
        System.out.println(box.getItem());

        /*Box<Double> box = new Box<>();
        box.setItem(3.14);
        System.out.println(box.getItem());*/

        Product<String, Double> product1 = new Product<>("Apple", 1.05);
        Product<String, Integer> product2 = new Product<>("Book", 10);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());

    }
}
