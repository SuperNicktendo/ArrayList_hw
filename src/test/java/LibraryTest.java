import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void setUp(){
        book1 = new Book("The Hobbit","JRR Tolkein", "Fantasy");
        book2 = new Book("Fear and Loathing in Las Vegas", "Hunter S. Thompson", "Comedy");
        book3 = new Book("It", "Stephen King", "Horror");
        library = new Library(3);
        borrower = new Borrower("Jack");
    }

    @Test
    public void canCheckBookTotal(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook(book1);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void borrowerCanTakeBookFromLibraryAndAddToOwnCollection(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(book1, library);
        assertEquals(1, borrower.collectionCount());
        assertEquals(1, library.bookCount());
    }
    
}
