import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {
    String title;
    String author;
    LocalDate dateOfLoan;

public static String getName(Book book){
    return "Titel: " + book.title +
            "\nAuthor: " + book.author;}

public static long daysOfLoan(Book book) {
    LocalDate today = LocalDate.now();
    return ChronoUnit.DAYS.between(book.dateOfLoan, today);
 }

 public static String messageLoan(Book book) {
     long Loan = Book.daysOfLoan(book);
     String message;
     if (Loan <=21)
         message = "\nYou kan keep the book up to 21 days from the day of loan. " +
                 "\nYou have "+ (21-Loan) +" days remaining.";
     else
         message = "\nYou kan keep your book up to 21 days. "+ "Your loan is now "+
                 (Loan - 21) + " days late. \nFee to pay: " + ((Loan-21)*20) +
                 " SEK. \nPlease return your book or prolong your loan!";
     return message;
 }
}