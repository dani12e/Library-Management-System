import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Input your test score (0-100)");

        int score = scanner.nextInt();
        
        if (score >=90) {
            System.out.println("you got an A!");
            
        }
        else if (score >= 80 ) {
            System.out.println("you got a b ");
            
        }
        else if ( score >=70){
            System.out.println("you got a c");

        }
        else if (score >= 60) {
            System.out.println(" you got a c");
            
        }
    }
    
}
