public class Book {
    private int bookId;
    private String details;

    public Book(int bookId, String details) {
        this.bookId = bookId;
        this.details = details;
    }

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int id) {
        this.bookId = id;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
}