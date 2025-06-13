public class Exercise3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int count = scanner.nextInt();

        System.out.println( "enter countdown: " + count);

      do {
        System.out.println(count);
        count--;
      } while ( count >-1
      );
    }
}
