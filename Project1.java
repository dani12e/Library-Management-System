import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project1 {

    static class Library {
        List<String> books = new ArrayList<>();

        void addBook(String book) {
            books.add(book);
            System.out.println("\"" + book + "\" added to the library.");
        }

        void availableBooks() {
            if (books.isEmpty()) {
                System.out.println("There are no books available.");
            } else {
                System.out.println("Available books:");
                books.forEach(System.out::println);
            }
        }

        void returnBook(String bookName, String username) {
            books.add(bookName);
            System.out.println(username + " just returned \"" + bookName + "\".");
        }

        void borrowBook(String bookName, String username) {
            if (books.contains(bookName)) {
                books.remove(bookName);
                System.out.println(username + " just borrowed \"" + bookName + "\".");
            } else {
                System.out.println("Sorry, \"" + bookName + "\" is not available.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Preload some books
        library.addBook("Harry Potter");
        library.addBook("The Hobbit");
        library.addBook("Percy Jackson");

        boolean running = true;

        System.out.println("\n📚 Welcome to the Library System 📚\n");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. View available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    library.availableBooks();
                    break;
                case "2":
                    System.out.print("Enter your name: ");
                    String userBorrow = scanner.nextLine();
                    System.out.print("Enter the book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle, userBorrow);
                    break;
                case "3":
                    System.out.print("Enter your name: ");
                    String userReturn = scanner.nextLine();
                    System.out.print("Enter the book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle, userReturn);
                    break;
                case "4":
                    System.out.println("Exiting... Goodbye! 👋");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
