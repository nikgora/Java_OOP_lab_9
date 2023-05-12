import java.awt.print.Book;
import java.beans.Transient;
import java.io.*;
import java.io.Reader;
import java.util.ArrayList;

public class Library implements Externalizable {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(books);
        out.writeObject(readers);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        books = (ArrayList<Book>) in.readObject();
        readers = (ArrayList<Reader>) in.readObject();
    }
}

