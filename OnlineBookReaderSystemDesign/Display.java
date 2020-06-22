public class Display {
    private Book activeBook;
    private User activeUser;
    private int pageNumber;

    public void displayUsername(User user) {
        this.activeUser = user;
        refreshUsername();
    }

    public void displayBook(Book book) {
        this.pageNumber = 0;
        this.activeBook = book;
        refreshTitle();
        refreshPage();
        refreshDetails();
    }

    public void turnPageForward() {
        pageNumber++;
        refreshPage();
    }

    public void turnPageBackward() {
        pageNumber--;
        refreshPage();
    }

    public void refreshUsername() {

    }
    public void refreshTitle() {

    }
    public void refreshDetails() {

    }
    public void refreshPage() {

    }
}