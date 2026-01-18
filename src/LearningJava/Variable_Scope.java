package LearningJava;

public class Variable_Scope {
    static int a = 3; //CLASS

    public static void main(String[] args) {

        int a = 1; //LOCAL
        System.out.println(a);
        callBack();
    }
    static void callBack(){
        int a = 2; //LOCAL
        System.out.println(a);
    }
}
