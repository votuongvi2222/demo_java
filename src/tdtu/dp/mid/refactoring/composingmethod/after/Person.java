package tdtu.dp.mid.refactoring.composingmethod.after;


public class Person {

    private String fullName;

    // Tuoi co the suy ra tu ngay sinh
    private InputDate dateOfBirth;

    private String address;
    private String gender;


    public Person() {
    }

    public Person(String fullName, InputDate dateOfBirth, String address, String gender) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public InputDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(InputDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    // check gender before assign value
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int computeAge(){
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
