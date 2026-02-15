package LearningJava;

public class Break_Continue {
    public static void main(String[] args) {

        /*for(int i = 0; i < 10; i++){
            if (i == 5) {
                break; STOP the loop
            }
            System.out.print(i);
        }*/

        for(int i = 0; i < 10; i++){
            if (i == 5) {
                continue; //SKIP the specific cycle
            }
            System.out.print(i);
        }
    }
}
