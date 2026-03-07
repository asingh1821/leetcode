package designClassAndObject.designLibrary;

import java.util.List;

public class Library {
    private int libId;
    private String libName;
    private String city;

    List<Book> books;
    public Library(int libId, String libName, String city, List<Book> books) {
        this.libId=libId;
        this.libName=libName;
        this.city=city;
        this.books=books;
    }
    public int getLibId(){
        return libId;
    }
    public String getLibName(){
        return libName;
    }
    public String getCity(){
        return city;
    }
    public List<Book> getBooks(){
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libId=" + libId +
                ", libName='" + libName + '\'' +
                ", city='" + city + '\'' +
                ", books=" + books +
                '}';
    }
}
