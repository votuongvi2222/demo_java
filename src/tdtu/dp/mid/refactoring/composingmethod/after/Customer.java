package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

// duplicate code
public class Customer extends Person {

    // Chi khach hang moi co xep hang
    private CustomerCategory customerCategory;
    private String phoneNumber;
    public Customer() {
    }

    public Customer(CustomerCategory customerCategory, String phoneNumber, String fullName, InputDate dateOfBirth,  String address, String gender) {
        super(fullName, dateOfBirth, address, gender);
        this.customerCategory = customerCategory;
        setPhoneNumber(phoneNumber);
    }

    public CustomerCategory getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(CustomerCategory customerCategory) {
        this.customerCategory = customerCategory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if ((PhoneNumberValidator.isValid(phoneNumber)))
            this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber.equals(customer.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + super.getFullName() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                ", address='" + super.getAddress() + '\'' +
                ", gender='" + super.getGender() + '\'' +
                ", customerCategory=" + customerCategory +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
