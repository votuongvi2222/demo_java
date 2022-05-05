package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class CreditCard implements Payment{
    private String name;
    private String cardNumber;
    private String cvv;
    private InputDate expiredDate;

    public CreditCard(){};

    public CreditCard(String name, String cardNumber, String cvv, InputDate expiredDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiredDate = expiredDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public InputDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(InputDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " ia paid with credit card.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return name.equals(that.name) && cardNumber.equals(that.cardNumber) && cvv.equals(that.cvv) && expiredDate.equals(that.expiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cardNumber, cvv, expiredDate);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
