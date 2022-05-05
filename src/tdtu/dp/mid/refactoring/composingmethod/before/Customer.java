package tdtu.dp.mid.refactoring.composingmethod.before;

public class Customer extends Person{
    public Customer() {
    }

//  Duplicate code -> trùng các đối số trong hàm khởi tạo
//  Tạo tác giả với nhiều thông tin kế thừa không cần thiết
    public Customer(int rank, int salary, String fullName, String dateOfBirth, int age, String address, String nation, String gender, String field, int position) {
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
                ", rank='" + super.getRank() +
                '}';
    }
}
