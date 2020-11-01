import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Book {
    String title;
    String author;
    double price;

public static String getName(Book book){ return "Titel: " + book.title + "\nAuthor:  " + book.author +"\nPrice: " +  book.price;}

public static long daysOfLoan(Book book) {
    LocalDate today = LocalDate.now();
    System.out.println("Current date: " + today);
    LocalDate dateOfLoan = LocalDate.of(2020, Month.OCTOBER, 20 );
    System.out.println("Day of loan: " + dateOfLoan);
    return ChronoUnit.DAYS.between(dateOfLoan, today);

 }

 public static String messageLoan (Book book) {
     long Loan = Book.daysOfLoan(book);
     String message;
     if (Loan <=21)
         message = "no late loan";
     else (Loan > 21)
         message = "late!";
     return message;
 }
}