package book;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    Book createNewBook(String title){
        Random random = new Random();
        Book book = new Book(random.nextInt(), title);
        this.books.add(book);
        System.out.println("Stworzyłem nową książkę o tytule " + book.getTitle());
        return book;
    }

    void readAll() {
        Gson gson = new Gson();
        FileReader fr = null;
        try {
            fr = new FileReader("./books_json");
            List<Book> loadedBooks = gson.fromJson(fr, new TypeToken<List<Book>>(){}.getType());
            this.books.addAll(loadedBooks);
            this.books.forEach(book -> {
                System.out.println("Załadowano książkę : " + book.getTitle());
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void saveAll() throws IOException {
        Gson gson = new Gson();
        FileWriter fw = new FileWriter("./books_json");
        gson.toJson(this.books, fw);
        fw.flush();
        fw.close();
    }


}
