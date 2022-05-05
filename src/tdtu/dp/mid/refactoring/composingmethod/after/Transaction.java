package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Date;
import java.util.Hashtable;
import java.util.Objects;

public class Transaction {
    // Should convert to object

    private Date date;
    private Customer customer;
    private Staff staff;
    private ShoppingCart cart;
    private Payment payment;

    public Transaction() {
    }

    public Transaction(Customer customer, Staff staff, ShoppingCart cart, Payment payment) {
        this.customer = customer;
        this.staff = staff;
        this.cart = cart;
        this.date = new Date();
        this.payment = payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public int getTotalAmount(){
        return cart.calculateTotal();
    }

    public Payment getPayment(){
        return payment;
    }
    public void setPayment(Payment payment){
        this.payment = payment;
    }
    public void pay(){
        payment.pay(getTotalAmount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return date.equals(that.date) && customer.equals(that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, customer);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", customer=" + customer +
                ", staff=" + staff +
                ", cart=" + cart +
                ", payment=" + payment +
                '}';
    }
}
