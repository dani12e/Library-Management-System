import java.util.HashSet;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 3 student names (duplicates will be ignored):");

        for (int i = 0; i < 3; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            String name = scanner.nextLine().trim();

            if (students.contains(name)) {
                System.out.println("Duplicate name detected. Not added.");
            } else {
                students.add(name);
            }
        }

        System.out.println("\nUnique names entered:");
        for (String student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
