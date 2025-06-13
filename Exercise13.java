public class Exercise13 {
    public static class Greeting {
        String name;

        // Default constructor
        public Greeting() {
            System.out.println("Greeting created.");
        }

        // Overloaded constructor
        public Greeting(String name) {
            this.name = name;
            System.out.println("Greeting created for " + name);
        }

        // Default sayHello method
        void sayHello() {
            System.out.println("Hello!");
        }

        // Overloaded sayHello method
        void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();                // Default constructor
        Greeting greeting2 = new Greeting("Daniel");       // Overloaded constructor

        greeting.sayHello();                               // sayHello()
        greeting2.sayHello("Daniel");                      // sayHello(String)
    }
}
