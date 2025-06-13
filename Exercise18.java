import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentscore = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names of students and their scores:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            studentscore.put(name, score);
        }

        System.out.println("\nAll Student Scores:");
        for (Map.Entry<String, Integer> entry : studentscore.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nStudents with A Grade (score > 70):");
        for (Map.Entry<String, Integer> entry : studentscore.entrySet()) {
            if (entry.getValue() > 70) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        scanner.close();
    }
}
