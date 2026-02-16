package LearningJava;

import java.util.HashMap;

public class Hash_Maps {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("Apple", 0.50);
        map.put("Banana", 0.70);
        map.put("Pineapple", 2.00);

        //map.put("Apple", 10.00);
        //map.remove("Apple");

        //System.out.println(map);
        //System.out.println(map.get("Apple"));
        //System.out.println(map.containsKey("Orange"));

        /*if(map.containsKey("Orange")){
            System.out.println(map.get("Orange"));
        }
        else{
            System.out.println("Key not found");
        }*/

        //System.out.println(map.containsValue(10.00));
        //System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : £" + map.get(key));
        }
    }
}
