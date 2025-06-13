import java.io.InputStream;
import java.util.*;

public class Scanner {
    public Scanner(InputStream in) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
        int age = 22;
        String name = "Jacinta";

        System.out.println( "name : " + name);
        System.out.println("age : " + age);

        System.out.println("What is your name");
        
        String username = scanner.nextLine();
         System.out.println("whats your age");

         int userage = scanner.nextInt();

         System.out.println( userage + " " + username);
    }
    
}
