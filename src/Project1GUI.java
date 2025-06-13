import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Project1GUI {

    static class Library {
        List<String> books = new ArrayList<>();

        void addBook(String book) {
            books.add(book);
        }

        List<String> getAvailableBooks() {
            return books;
        }

        boolean borrowBook(String book) {
            return books.remove(book);
        }

        void returnBook(String book) {
            books.add(book);
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Harry Potter");
        library.addBook("The Hobbit");
        library.addBook("Percy Jackson");

        // Create GUI frame
        JFrame frame = new JFrame("📚 Library System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Components
        JTextArea displayArea = new JTextArea(10, 40);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        JTextField bookField = new JTextField(20);
        JTextField userField = new JTextField(15);
        JButton viewButton = new JButton("View Books");
        JButton borrowButton = new JButton("Borrow Book");
        JButton returnButton = new JButton("Return Book");

        // View books
        viewButton.addActionListener(e -> {
            displayArea.setText("Available Books:\n");
            for (String book : library.getAvailableBooks()) {
                displayArea.append("- " + book + "\n");
            }
        });

        // Borrow book
        borrowButton.addActionListener(e -> {
            String book = bookField.getText().trim();
            String user = userField.getText().trim();
            if (library.borrowBook(book)) {
                displayArea.setText(user + " borrowed \"" + book + "\".");
            } else {
                displayArea.setText("Book not available.");
            }
        });

        // Return book
        returnButton.addActionListener(e -> {
            String book = bookField.getText().trim();
            String user = userField.getText().trim();
            library.returnBook(book);
            displayArea.setText(user + " returned \"" + book + "\".");
        });

        // Add to frame
        frame.add(new JLabel("User:"));
        frame.add(userField);
        frame.add(new JLabel("Book:"));
        frame.add(bookField);
        frame.add(viewButton);
        frame.add(borrowButton);
        frame.add(returnButton);
        frame.add(scrollPane);

        // Show GUI
        frame.setVisible(true);
    }
}
