package tdtu.dp.mid.refactoring.composingmethod.before;

public class Staff extends Person{
    public Staff() {
    }

//  Duplicate code -> trùng các đối số trong hàm khởi tạo
//  Tạo tác giả với nhiều thông tin kế thừa không cần thiết
    public Staff(int rank, int salary, String fullName, String dateOfBirth, int age, String address, String nation, String gender, String field, int position) {
        super(rank, salary, fullName, dateOfBirth, age, address, nation, gender, field, position);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", nation='" + super.getNation() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", field='" + super.getField() + '\'' +
                ", position=" + super.getPosition() + '\'' +
                ", salary=" + super.getSalary() + '\'' +
                '}';
    }
}
