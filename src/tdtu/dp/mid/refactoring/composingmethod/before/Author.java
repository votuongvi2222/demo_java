package tdtu.dp.mid.refactoring.composingmethod.before;

import java.util.ArrayList;

public class Author extends Person{

//  Inappropriate Intimacy -> Không cần thiết do ở mỗi cuốn sách đã có thông tin tác giả
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Author() {
    }

//  Duplicate code -> trùng các đối số trong hàm khởi tạo
//  Tạo tác giả với nhiều thông tin kế thừa không cần thiết
    public Author(int rank, int salary, String fullName, String dateOfBirth, int age, String address, String nation, String gender, String field, int position, ArrayList<Book> books) {
        super(rank, salary, fullName, dateOfBirth, age, address, nation, gender, field, position);
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth='" + super.getDateOfBirth() + '\'' +
                ", age=" + super.getAge() +
                ", address='" + super.getAddress() + '\'' +
                ", nation='" + super.getNation() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", field='" + super.getField() +
                '}';
    }
}
