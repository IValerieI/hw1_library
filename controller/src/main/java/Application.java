import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        int length = args.length;

        String authorName = args[0];
        for (int i = 1; i < length; i++) {
            authorName = authorName + " " + args[i];
        }
        Author author = new Author(authorName);

        Library library = new LibraryFactory().createLibrary();
        HashMap<Author, LinkedList<Book>> archive = library.getArchive();


        LinkedList<Book> list = archive.get(author);
        if (list == null) {
            System.out.println("There is no such author");
        } else {
            for (Book book : list) {
                Gson gson = new Gson();
                String json = gson.toJson(book);
                System.out.println(json);
            }

        }


    }
}
