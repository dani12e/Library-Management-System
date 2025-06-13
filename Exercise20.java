import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("enter divisor");
        int a = scanner.nextInt();

        System.out.println("enter dividend");
        int b = scanner.nextInt();


       try {
        int c = b/a;
        System.out.println(c);
       } catch (ArithmeticException e) {
        System.out.println("indivisible");
       } finally{
        System.out.println("end of program");
        }
    }
}
