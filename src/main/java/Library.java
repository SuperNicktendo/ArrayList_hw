import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Book> library;
    private HashMap<String, Integer> genreCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.library = new ArrayList<Book>();
        this.genreCollection = new HashMap<String, Integer>();
    }

    public int bookCount(){
       return this.library.size();
    }

    public void addBook(Book book){
        if(bookCount() < this.capacity)
        this.library.add(book);

    }

    public void removeBook(Book book){
        this.library.remove(book);
    }

}
