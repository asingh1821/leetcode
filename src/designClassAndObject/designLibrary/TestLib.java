package designClassAndObject.designLibrary;

import java.util.Arrays;
import java.util.List;

public class TestLib {
    public static void main(String[] args) {
        Book b1 = new Book(101,"Phy","Amit",500,true);
        Book b2 = new Book(102,"Chem","Aman",300,false);
        Book b3 = new Book(103,"Maths","Ankit",350,true);
        Book b4 = new Book(104,"Bio","Vibh",175,true);
        Book b5 = new Book(105,"Psy","Rinku",550,false);
        Book b6 = new Book(106,"Eng","Siddhu",320,true);

        Library l1 = new Library(1,"Central Lib", "Blr",
                Arrays.asList(b1,b2,b3,b5));
        Library l2 = new Library(1,"Tech Lib", "Mngr",
                Arrays.asList(b1,b2));
        Library l3 = new Library(1,"Cultural Lib", "ccu",
                Arrays.asList(b2,b3,b4));
        Library l4 = new Library(1,"Modern Lib", "Pnbe",
                Arrays.asList(b1,b2,b3,b4));
        Library l5 = new Library(1,"Chanakya Lib", "Mumbai",
                Arrays.asList(b1,b4));
        Library l6 = new Library(1,"Chennai Lib", "Chennai",
                Arrays.asList(b1,b2,b3,b4,b5));

        List<Library> libraryList = Arrays.asList(l1,l2,l3,l4,l5,l6);
        LibraryServiceImpl libraryService = new LibraryServiceImpl(libraryList);

        //find list of available books
        //libraryService.findAllAvailableBooks()
        //        .forEach(System.out::println);

        //sort books wrt price
        libraryService.sortBookByPrice()
                .forEach(System.out::println);

        //libraries having more than 3 books
        libraryService.librariesWithMoreThan3Books()
                .forEach(System.out::println);
    }
}
