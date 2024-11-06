public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }



//    public static void main(String[] args) {
//        BookSingleton book1, book2;
//
//        book1 = BookSingleton.borrowBook();
//        book2 = BookSingleton.borrowBook();
//
//        if (book1 == null) {
//            System.out.println("The book is already borrowed.");
//        } else {
//            System.out.println("You have borrowed the book: " + book1.getTitle());
//        }
//
//        if (book2 == null) {
//            System.out.println("The book is already borrowed.");
//        } else {
//            System.out.println("You have borrowed the book: " + book2.getTitle());
//        }
//
//        book1.returnBook(book1);
//        book2 = BookSingleton.borrowBook();
//
//        if (book2 == null) {
//            System.out.println("The book is already borrowed.");
//        } else {
//            System.out.println("You have borrowed the book: " + book2.getTitle());
//        }
//    }
}
