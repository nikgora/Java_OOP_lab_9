import java.io.*;

public class Author implements Externalizable {

    int yearOfBirth;
    String name;
    String familyName;

    public Author(int yearOfBirth, String name, String familyName) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.familyName = familyName;
    }

    public Author() {
        this.familyName="";
        this.name="";
        this.yearOfBirth=Integer.MIN_VALUE;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "People{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(yearOfBirth);
        out.writeObject(name);
        out.writeObject(familyName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        yearOfBirth = in.readInt();
        name = (String) in.readObject();
        familyName = (String) in.readObject();

    }
}
