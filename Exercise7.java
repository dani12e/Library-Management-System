import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("enter your name:");
        String name = scanner.nextLine();
        String quote = scanner.nextLine();

        System.out.println(name);

        System.out.println("enter your fav quote");

        System.out.println(quote.toUpperCase());

        System.out.println(quote.length());

        System.out.println(quote.contains("life"));

    }
}
