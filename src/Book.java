import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {
    String title;
    String author;
    double price;
    LocalDate dateOfLoan;

public static String getName(Book book){
    return "Titel: " + book.title +
            "\nAuthor:  " + book.author +
            "\nPrice: " +  book.price;}

public static long daysOfLoan(Book book) {
    LocalDate today = LocalDate.now();
    return ChronoUnit.DAYS.between(book.dateOfLoan, today);
 }

 public static String messageLoan(Book book) {
     long Loan = Book.daysOfLoan(book);
     String message;
     if (Loan <=21)
         message = "no late loan";
     else
         message = "late!";
     return message;
 }
}