public class Exercise9 {

    // Define the Student class
    public static class Student {
        String name;
        String matricNumber;
        int age;

        // Instance method (not static)
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Matric Number: " + matricNumber);
        }
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();
        student1.name = "Daniel";
        student1.age = 21;
        student1.matricNumber = "ENG/MEE/200334";

        // Call method
        student1.displayInfo();

        // Optional: create another student
        Student student2 = new Student();
        student2.name = "Jane";
        student2.age = 22;
        student2.matricNumber = "ENG/CHE/200999";
        student2.displayInfo();
    }
}
