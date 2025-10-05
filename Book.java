public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int currentPage;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.currentPage = 0;
    }

    public void changePage(int newPage) {
        if (newPage >= 0) {
            this.currentPage = newPage;
            System.out.println("Current page of '" + this.title + "' changed to " + newPage + ".");
        } else {
            System.out.println("Error: Page number cannot be negative.");
        }
    }
    
    public void changeAuthor(String newAuthor) {
        String oldAuthor = this.author;
        this.author = newAuthor;
        System.out.println("Author of '" + this.title + "' changed from " + oldAuthor + " to " + newAuthor + ".");
    }

    public void displayDetails() {
        System.out.println(
            "Title: " + title + 
            ", Author: " + author + 
            ", Year: " + yearPublished + 
            ", Current Page: " + currentPage
        );
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
