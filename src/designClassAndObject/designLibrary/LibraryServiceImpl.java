package designClassAndObject.designLibrary;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService{

    private List<Library> libraryList;
    public LibraryServiceImpl(List<Library> libraryList){
        this.libraryList=libraryList;
    }
    @Override
    public List<Book> findAllAvailableBooks() {
        return libraryList.stream()
                .flatMap(lib-> lib.getBooks().stream())
                        .filter(book -> book.isAvailable())
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> sortBookByPrice() {
        return libraryList.stream()
                .flatMap(library -> library.getBooks()
                        .stream()
                        .sorted(Comparator.comparingDouble(Book::getPrice)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Library> librariesWithMoreThan3Books() {
        return libraryList.stream()
                .filter(lib-> lib.getBooks().size() > 3)
                .collect(Collectors.toList());
    }
}
