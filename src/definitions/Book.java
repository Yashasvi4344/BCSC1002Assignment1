/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private final String bookName;
    private final String authorName;
    private final String thirteenDigitISBNNumberOfBook;

    public Book(String bookName, String authorName, String thirteenDigitISBNNumberOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.thirteenDigitISBNNumberOfBook = thirteenDigitISBNNumberOfBook;
    }

}

    public Book() {
        this.bookName = null;
        this.authorName = null;
        this.thirteenDigitISBNNumberOfBook = null;
    }

    public String getbookName() {
        return bookName;
    }

    public void setbookName(String bookName) {
        this.bookName = bookName;
    }

    public String getauthorName() {
        return authorName;
    }

    public void setauthorName(String nameOfTheAuthorOfTheBook) {
        this.authorName = authorName;
    }

    public String getthirteenDigitISBNNumberOfBook() {
        return thirteenDigitISBNNumberOfTheBook;
    }

    public void setThirteenDigitISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName() + ", " +
                "Author Name: " + authorName() + ", " +
                "13-Digit ISBN Number: " + getthirteenDigitISBNNumberOfTheBook() + ".";
    }
}




}

