import java.awt.print.Book;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;

public class Library implements Serializable {
    String name;
    ArrayList<Book>books;
    ArrayList<Reader>readers;

    public Library(String name, ArrayList<Book> books, ArrayList<Reader> readers) {
        this.name = name;
        this.books = books;
        this.readers = readers;
    }

    public Library() {
        this.name="";
        this.books=new ArrayList<>(0);
        this.readers=new ArrayList<>(0);
    }

    public void AddBook(Book book){
        books.add(book);
    }
    public void RemoveBook(Book book){
        books.remove(book);
    }
    public void AddReader(Reader book){
        readers.add(book);
    }
    public void RemoveReader(Reader book){
        readers.remove(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }
}

