
public class BookDemo {
    public static void main(String[] arg) {
        Book book1;
        book1 = new Book();
        //CHANGE NAME
        book1.title = "Java - steg för steg";
        book1.author = "Jan Skansholm";
        book1.price = 399;
        //WRITE NAME with help of method
        System.out.println(Book.getName(book1));
        //work with number of loan days
        System.out.println("Days of loan: "  + Book.daysOfLoan() + " days");
        //work with days of loan
        long Loan = Book.messageLoan(Book);
        System.out.println(Loan);
        System.out.println("Loan: ", Book.messageLoan(book1));

    }
}
