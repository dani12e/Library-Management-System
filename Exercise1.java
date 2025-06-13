import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String favouritecolor = "Blue";
        String hobby = "football";

        System.out.println( "my favourite color is " + favouritecolor);
        System.out.println("my hobby is playing " + hobby);


        System.out.println("enter your favourite color : ");
        String color = scanner.nextLine();

        System.out.println("enter your hobby : ");
        String Hobby = scanner.nextLine();

        System.out.println( color + Hobby);
    }
}