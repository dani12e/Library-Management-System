import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int no = scanner.nextInt();

        System.out.println(" Enter a number: " + no);
        
        
        int a;
           

        for (int b = 1; b <13; b++) {
             a = no * b;
            System.out.println(no +"*" + b +"="+ a);
            
        }
    }
    
}
