import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class Exercise22 {
    static class Book implements Serializable{
        String title;
        String author;
        int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        @Override
public String toString() {
    return "Title: " + title + ", Author: " + author + ", Year: " + year;
}


        
    }
    public static void main(String[] args) {
        Book book = new Book("Loop", "Daniel",2024);
        ObjectOutputStream out;
        ObjectInputStream in;
        try {
            out = new ObjectOutputStream(new FileOutputStream("book.ser"));
            out.writeObject(book);
        out.close();
        System.out.println("done");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            in = new ObjectInputStream(new FileInputStream("book.ser"));
            Book book1 = (Book) in.readObject();
            System.out.println(book1.toString());
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
