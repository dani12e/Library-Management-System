import java.util.*;

public class Exercise17 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter 5 names : ");
        for (int i = 0; i < 5 ; i++) {
            String name = scanner.nextLine();

            students.add(name);
        }
        System.out.println("-------------------");

        System.out.println("fruits that start with A");
        System.out.println("------------------");
        for (String student : students) {
            if(student.toUpperCase().toString().startsWith("A")){
                System.out.println(student);
            }
        }
        
    }
}
