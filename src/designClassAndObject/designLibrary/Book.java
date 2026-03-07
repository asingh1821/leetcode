package designClassAndObject.designLibrary;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(int bookId, String title, String author, double price, boolean isAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=isAvailable;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return  title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
