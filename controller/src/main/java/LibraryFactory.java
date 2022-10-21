import java.util.HashMap;
import java.util.LinkedList;

public class LibraryFactory {

    public Library createLibrary() {
        String libraryName = "Interesting books";
        HashMap<Author, LinkedList<Book>> archive = new HashMap<>();
        int size = 6;

        // 1
        Author author1 = new Author("F. Scott Fitzgerald");
        Book book11 = new Book(author1, "The Great Gatsby", 300);
        LinkedList<Book> listOfBooks1 = new LinkedList<>();
        listOfBooks1.add(book11);
        archive.put(author1, listOfBooks1);

        // 2
        Author author2 = new Author("Agatha Christie");
        Book book21 = new Book(author2, "Murder on the Orient Express", 110);
        Book book22 = new Book(author2, "The Murder of Roger Ackroyd", 150);
        LinkedList<Book> listOfBooks2 = new LinkedList<>();
        listOfBooks2.add(book21);
        listOfBooks2.add(book22);
        archive.put(author2, listOfBooks2);

        // 3
        Author author3 = new Author("Arthur Conan Doyle");
        Book book31 = new Book(author3, "The Adventures of Sherlock Holmes", 110);
        Book book32 = new Book(author3, "A Study in Scarlet", 150);
        Book book33 = new Book(author3, "The Hound of the Baskervilles", 150);
        LinkedList<Book> listOfBooks3 = new LinkedList<>();
        listOfBooks3.add(book31);
        listOfBooks3.add(book32);
        listOfBooks3.add(book33);
        archive.put(author3, listOfBooks3);

        Library library = new Library(libraryName, archive, size);
        return library;

    }
}
