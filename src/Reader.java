import java.awt.print.Book;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;


public class Reader extends Author {
    int libraryNumber;
    ArrayList<Book> books;


    public void AddBook(Book book){
        books.add(book);
    }
    public void RemoveBook(Book book){
        books.remove(book);
    }
    public Reader(int yearOfBirth, String name, String familyName, int libraryNumber, ArrayList<Book> books) {
        super(yearOfBirth, name, familyName);
        this.libraryNumber = libraryNumber;
        this.books = books;
    }

    public Reader(int libraryNumber, ArrayList<Book> books) {
        super();
        this.libraryNumber = libraryNumber;
        this.books = books;
    }
    public Reader(){
        super();
        this.libraryNumber=-1;
        this.books=new ArrayList<Book>(0);
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(yearOfBirth);
        out.writeObject(name);
        out.writeObject(familyName);
        out.writeInt(libraryNumber);
        out.writeObject(books);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        yearOfBirth = in.readInt();
        name = (String) in.readObject();
        familyName = (String) in.readObject();
        libraryNumber=in.readInt();
        books=(ArrayList<Book>) in.readObject();
    }
}
