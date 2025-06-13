public class Exercise28 {
    @FunctionalInterface
    public interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda expression to add two numbers
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> b != 0 ? a / b : 0; // handle divide-by-zero

        // Testing the operations
        System.out.println("Addition: " + addition.operate(2, 3));
        System.out.println("Subtraction: " + subtraction.operate(5, 2));
        System.out.println("Multiplication: " + multiplication.operate(4, 3));
        System.out.println("Division: " + division.operate(10, 2));
    }
}
