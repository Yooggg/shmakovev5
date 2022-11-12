package number4;

public class Book {
    private String bookName;
    private String autor;

    public Book(String bookName, String autor) {
        this.bookName = bookName;
        this.autor = autor;
    }
    public String getBookName() {
        return bookName;
    }

    public String getAutor() {
        return autor;
    }
}
