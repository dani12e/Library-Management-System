public class Exercise10 {

    // Student class with a constructor
    public static class Student {
        String name;
        int age;
        String matricNumber;

        // Constructor
        public Student(String name, int age, String matricNumber) {
            this.name = name;
            this.age = age;
            this.matricNumber = matricNumber;
        }

        // Method to display info
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Matric Number: " + matricNumber);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        // Creating objects using constructor
        Student daniel = new Student("Daniel", 21, "ENG/MEE/200334");
        Student jane = new Student("Jane", 22, "ENG/CHE/200999");

        // Displaying info
        daniel.displayInfo();
        jane.displayInfo();
    }
}
