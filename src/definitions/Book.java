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
}




}

