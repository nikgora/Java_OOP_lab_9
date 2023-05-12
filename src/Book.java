
import java.io.*;
import java.util.ArrayList;

public class Book implements Externalizable {
    String name;
    ArrayList<Author> authors;
    int publishedYear;
    int serialNumber;

    public Book() {
        this.name="";
        this.authors=new ArrayList<Author>(0);
        this.publishedYear=Integer.MIN_VALUE;
        this.serialNumber=-1;
    }

    public Book(String name, ArrayList<Author> authors, int publishedYear, int serialNumber) {
        this.name = name;
        this.authors = authors;
        this.publishedYear = publishedYear;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", publishedYear=" + publishedYear +
                ", serialNumber=" + serialNumber +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(authors);
        out.writeInt(publishedYear);
        out.writeInt(serialNumber);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        authors = (ArrayList<Author>) in.readObject();
        publishedYear = in.readInt();
        serialNumber = in.readInt();
    }
}
