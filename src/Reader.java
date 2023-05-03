import java.awt.print.Book;
import java.util.ArrayList;


public class Reader extends Author {
    int libraryNumber;
    ArrayList<Book> books;

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
}
