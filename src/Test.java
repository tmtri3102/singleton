public class Test {
    public static void main(String[] args) {
        System.out.println("Begin testing singleton pattern");
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book.");
        System.out.println("BookBorrower1's book: " + bookBorrower1.getAuthorAndTitle()); // Design Patterns by Gamma, Helm, Johnson, and Vlissides

        System.out.println("BookBorrower2 asked to borrow the book.");
        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2's book: " + bookBorrower2.getAuthorAndTitle()); // I don't have the book

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book.");

        bookBorrower2.borrowBook();
        System.out.println("BookBorrower2's book: " + bookBorrower2.getAuthorAndTitle());
        System.out.println("End testing singleton pattern");
    }
}
