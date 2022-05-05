package tdtu.dp.mid.refactoring.composingmethod.before;

public class Person {
    private String fullName;
    private String dateOfBirth;

//  Tuổi có thể được suy ra từ ngày sinh
    private int age;

    private String address;
    private String nation;
    private String gender;

//  Không phải ai cũng có lĩnh vực sáng tác, chỉ có tác giả mới có
    private String field;

//  Chỉ có nhân viên mới có thông tin lương và vị trí
//  Primitive Obsession -> Khó hiểu, không dễ làm việc
    private int position;
    private int salary;

//  Chỉ có khách hàng mới có xếp hạng thành viên
//  Primitive Obsession -> Khó hiểu, không dễ làm việc
    private int rank;

    public Person() {
    }

    public Person(int rank, int salary, String fullName, String dateOfBirth, int age, String address, String nation, String gender, String field, int position) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.address = address;
        this.nation = nation;
        this.gender = gender;
        this.field = field;
        this.position = position;
        this.salary = salary;
        this.rank = rank;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

//  Tuổi truyền thủ công có thể gây ra mâu thuẫn với ngày sinh
    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getGender() {
        return gender;
    }

//  Giới tính nên được kiểm tra trước khi truyền vào
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

//  Chỉ có nhân viên mới cần tính lương
    public double calculateSalaryPerMonth(int totalWorkedHour){
        return totalWorkedHour*salary;
    }

//  Chỉ có khách hàng mới cần tính giảm giá
    public double calculateDiscount(int rank){
//      Không linh hoạt, khó cập nhật
        switch (rank) {
            case 1:
                return 0.1;
            case 2:
                return 0.2;
            case 3:
                return 0.3;
            case 4:
                return 0.5;
            case 5:
                return 0.7;
            default:
                return 0;
        }
    }
}
