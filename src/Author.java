import java.io.Serializable;

public class Author implements Serializable {

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
}
