public class Book {

    private String title;
    private String author;
    private Boolean loan;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.loan = false;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Boolean onLoan(){
        return loan;
    }
    public void lendBook(){
        this.loan = true;
    }
    public void returnBook(){
        this.loan = false;
    }
    @Override 
    public String toString(){
        String book_status = loan ? "Borrowed" : "Available";
        return "Title: " + title + " | Author: " + author + " | Status: " + book_status;
    }


}