package book;

public class Book {

    private long id;
    private String title;

    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
