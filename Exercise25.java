public class Exercise25 {
    public class Library {
        String libraryName;

        class Book {
            String title;
            String author;

            Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            void displayBook() {
                System.out.println(title + " : " + author);
            }
        }

        public void showBooks() {
            Book book1 = new Book("ACOTAR", "Sarah J. Maas");
            Book book2 = new Book("Percy Jackson", "Rick Riordan");

            book1.displayBook();
            book2.displayBook();
        }
    }

    public static void main(String[] args) {
        Exercise25 outer = new Exercise25();
        Library cityCentralLibrary = outer.new Library();

        cityCentralLibrary.showBooks();
    }
}
