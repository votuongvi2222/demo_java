package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class Momo implements Payment {

    private String name;
    private String phoneNumber;

    public Momo(){}

    public Momo(String name, String phoneNumber) {
        this.name = name;
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(PhoneNumberValidator.isValid(phoneNumber))
            this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Momo momo = (Momo) o;
        return phoneNumber.equals(momo.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " is paid with Momo.");
    }

    @Override
    public String toString() {
        return "Momo{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
