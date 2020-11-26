package book;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BookService {

    private BookRepository repository = new BookRepository();

    public Book createNewBook(String title){
        return repository.createNewBook(title);
    }

    public void readAll() {
        try {
            this.repository.readAll();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void saveAll() throws IOException {
        this.repository.saveAll();
    }
}
