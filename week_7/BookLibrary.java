public class BookLibrary {
    public static void main(String[] args) {
        book bk1 = new book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", "1925", "Fiction", true);
        book bk2 = new book("To Kill a Mockingbird", "Harper Lee", "9780061120084", "1960", "Fiction", false);
        book bk3 = new book("Metamorphosis", "Franz Kafka", "9780553213690", "1915", "Novella", true);
        book bk4 = new book("The Da Vinci Code", "Dan Brown", "9780307474278", "2003", "Thriller", true);
        System.out.println(bk1 + "\n");
        System.out.println(bk2 + "\n");
        System.out.println(bk3 + "\n");
        System.out.println(bk4 + "\n");
        System.out.println("===============================\n");
        System.out.println("Books Available in the Library:");
        bk1.booksAvailable();
        bk2.booksAvailable();
        bk3.booksAvailable();
        bk4.booksAvailable();
        System.out.println("===============================\n");
        System.out.println("Books Not Available in the Library:");
        bk1.booksNotAvailable();
        bk2.booksNotAvailable();
        bk3.booksNotAvailable();
        bk4.booksNotAvailable();
        System.out.println("===============================\n");
        System.out.println("Books Published After the Year 2000:");
        bk1.publishedYearGreaterThan2000();
        bk2.publishedYearGreaterThan2000();
        bk3.publishedYearGreaterThan2000();
        bk4.publishedYearGreaterThan2000();
    }
}