/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;
public class FrontDesk {
    public static void main(String[] args) {


        public class FrontDesk {
            private static final int ISSUE_A_NEW_BOOK = 3;
            private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK = 5;
            private static final int SHOW_ALL_ISSUED_BOOKS = 8;
            private static final int EXIT = 0;

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int studentChoice;
                Student student = new Student();
                Library library = new Library();
                library.setBooksInLibrary();
                String bookName;
                do {
                    System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
                    System.out.println("How may I help you today?");
                    System.out.println("1. Issue a new book for me.");
                    System.out.println("2. Return a previously issues book for me.");
                    System.out.println("3. Show me all my issues books.");
                    System.out.println("4. Exit.");
                    System.out.println("Enter your choice (1..4): ");
                    studentChoice = scanner.nextInt();
                    switch (studentChoice) {