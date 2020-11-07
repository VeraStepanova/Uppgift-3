import java.time.LocalDate;
import java.time.Month;

public class BookDemo {
    public static void main(String[] arg) {
        Book book1;
        book1 = new Book();
        //Change name, price or date of loan
        book1.title = "Java - steg för steg";
        book1.author = "Jan Skansholm";
        book1.dateOfLoan = LocalDate.of(2020, Month.OCTOBER, 1 );
        LocalDate today = LocalDate.now();
        //write title and author of the book with help of method
        System.out.println("Today's date: " + today);
        System.out.println(Book.getName(book1));
        System.out.println("Day of loan: " + book1.dateOfLoan);
        //work with number of loan days
        System.out.println("Days of loan: "  + Book.daysOfLoan(book1) + " days");
        //work with message about loaned book
        String message = Book.messageLoan(book1);
        System.out.println("Status of your loan: " + message);
    }
}
