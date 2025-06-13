import java.util.ArrayList;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 fruits:");
        for (int i = 0; i < 3; i++) {
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        System.out.println("\nYour fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit); 
        }

        System.out.println("\nRemoving first fruit...");
        fruits.remove(0);

        System.out.println("\nFruits after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
