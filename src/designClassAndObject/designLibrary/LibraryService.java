package designClassAndObject.designLibrary;

import java.util.List;

public interface LibraryService {
    List<Book> findAllAvailableBooks();
    List<Book> sortBookByPrice();
    List<Library> librariesWithMoreThan3Books();
}
