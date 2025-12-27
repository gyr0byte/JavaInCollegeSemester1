public class book {
    String title, author, ISBN, publicationYear, genre;
    boolean availabilityStatus;

    public book(String t, String a, String isbn, String py, String gn, boolean as) {
        this.title = t;
        this.author = a;
        this.ISBN = isbn;
        this.publicationYear = py;
        this.genre = gn;
        this.availabilityStatus = as;
    }

    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nISBN: " + ISBN +
                "\nPublication Year: " + publicationYear +
                "\nGenre: " + genre +
                "\nAvailability Status: " + (availabilityStatus ? "Available" : "Not Available");
    }

    void booksAvailable() {
        if (availabilityStatus) {
            System.out.println(title + " is available.");
        }
    }

    void booksNotAvailable() {
        if (!availabilityStatus) {
            System.out.println(title + " is not available.");
        }
    }

    void publishedYearGreaterThan2000() {
        int year = Integer.parseInt(publicationYear);
        if (year > 2000) {
            System.out.println(title + " was published after 2000.");
        }
    }
}