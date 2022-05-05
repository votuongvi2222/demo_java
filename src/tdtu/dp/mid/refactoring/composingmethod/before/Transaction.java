package tdtu.dp.mid.refactoring.composingmethod.before;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class Transaction {
//  Date và time cần được kiểm tra
    private String date;
    private String time;

    private Customer customer;
    private Staff staff;

//  IOC -> nên chuyển thành interface
    private Payment payment;

    private Hashtable<Book, Integer> books = new Hashtable<>();

    private int totalCost;

    public Transaction() {
    }

//  long parameters list -> không nên truyền tổng giá
    public Transaction(String date, String time, Customer customer, Staff staff, Payment payment, Hashtable<Book, Integer> books, int totalCost) {
        this.date = date;
        this.time = time;
        this.customer = customer;
        this.staff = staff;
        this.payment = payment;
        this.books = books;
        this.totalCost = totalCost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Hashtable<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(Hashtable<Book, Integer> books) {
        this.books = books;
    }

    public int getTotalCost() {
        return totalCost;
    }

//  Không nên tự nhập tổng tiền
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
