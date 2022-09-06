import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount(){
        return this.collection.size();
    }

    public void borrowBook(Book book, Library library) {
        this.collection.add(book);
        library.removeBook(book);
        }
}
