import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loan {
    private Person person;
    private Book book;
    private LocalDate LoanDate;

    public Loan(Person person, Book book){
        this.person = person;
        this.book = book;
        this.LoanDate = LocalDate.now();
    }
    public Person getPerson(){
        return person;
    }
    public Book getBook(){
        return book;
    }
    public LocalDate getDate(){
        return LoanDate;
    }

    @Override 
    public String toString(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Book: " + book.getTitle() + " | Borrowed by: " + person.getName() + " | Date: " + LoanDate.format(formatador);
    }
    

}
