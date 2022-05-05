package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.ArrayList;

public class Author extends Person {

    private String nation;

    public Author() {
    }

    public Author(String fullName, InputDate dateOfBirth,String address, String nation, String gender) {
        super(fullName, dateOfBirth, address, gender);
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", nation='" + nation + '\'' +
                '}';
    }
}
