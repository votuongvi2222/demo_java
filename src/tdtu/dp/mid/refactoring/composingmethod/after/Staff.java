package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class Staff extends Person {
    // Chi nhan vien moi co vi tri cap bac va luong, position should convert to object
    private String id;
    private Position position;
    private int salary;

    public Staff() {
    }

    public Staff(int salary, String fullName, InputDate dateOfBirth, String address, String gender, Position position, String id) {
        super(fullName, dateOfBirth, address, gender);
        this.position = position;
        this.salary = salary;
        this.id = id;
    }

    public double calculateSalaryPerMonth(int totalWorkedHour){
        return totalWorkedHour*salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id.equalsIgnoreCase(staff.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", id='" + id + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
