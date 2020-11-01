import java.time.LocalDate;
import java.time.Month;

public class BookDemo {
    public static void main(String[] arg) {
        Book book1;
        book1 = new Book();
        //CHANGE NAME
        book1.title = "Java - steg för steg";
        book1.author = "Jan Skansholm";
        book1.price = 399;
        book1.dateOfLoan = LocalDate.of(2020, Month.OCTOBER, 1 );
        //WRITE NAME with help of method
        System.out.println(Book.getName(book1));
        //work with number of loan days
        System.out.println("Days of loan: "  + Book.daysOfLoan(book1) + " days");
        //work with message about loaned book
        String message = Book.messageLoan(book1);
        System.out.println(" message: " + message);


    }
}
