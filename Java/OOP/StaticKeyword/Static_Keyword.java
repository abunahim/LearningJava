package LearningJava.Static_Keyword;

public class Static_Keyword {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Spiderman");
        Friend friend2 = new Friend("Venom");
        Friend friend3 = new Friend("Daredevil");
        Friend friend4 = new Friend("Kingpin");
        Friend friend5 = new Friend("Namor");

        //System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
