import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Vera Stepanova
 * Date: 2020-11-11
 * Project Uppgift-3
 */
public class Book {
    String title;
    String author;
    LocalDate dateOfLoan;

    /**
     * getLoan is a class method that returns title and author of the loaned book
     * @param book is an object of class Book
     * @return title and author (Title + Author)
     */
    public static String getBook(Book book){
    return "Title: " + book.title +
            "\nAuthor: " + book.author;}

    /**
     * daysOfLoan är en klass method that counts
     * number of days between day the loan of book was made and today's day
     * @param book is a reference to the object of klass Book
     * @return number of loan days
     */
    public static long daysOfLoan(Book book) {
    LocalDate today = LocalDate.now();
    return ChronoUnit.DAYS.between(book.dateOfLoan, today);
 }
    /**
     * messageLoan is a class method that returns message with the status of the loan
     * @param book ia loaned book
     * @return message
     */
 public static String messageLoan(Book book) {
     long Loan = Book.daysOfLoan(book);
     String message;
     if (Loan <=21)
         message = "\nYou kan keep the book up to 21 days from the day of loan. " +
                 "\nYou have "+ (21-Loan) +" days remaining.";
     else
         message = "\nYou kan keep your book up to 21 days. "+ "Your loan is now "+
                 (Loan - 21) + " days late. \nFee to pay: " + ((Loan-21)*10) +
                 " SEK. \nPlease return your book or pay the fee and extend your loan!";
     return message;
 }
}