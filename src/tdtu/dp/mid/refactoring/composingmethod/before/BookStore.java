package tdtu.dp.mid.refactoring.composingmethod.before;

import java.util.ArrayList;
import java.util.Set;

public class BookStore {

    private String name;
    // duplicate code
    private String address;

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Staff> staffs = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Payment> payments = new ArrayList<>();

    public BookStore() {
    }

    public BookStore(String name, String address, ArrayList<Book> books, ArrayList<Staff> staffs, ArrayList<Customer> customers, ArrayList<Transaction> transactions, ArrayList<Payment> payments) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.staffs = staffs;
        this.customers = customers;
        this.transactions = transactions;
        this.payments = payments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(ArrayList<Staff> staffs) {
        this.staffs = staffs;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public int calculateRevenue(){
        int sum = 0;
        for(Transaction transaction: transactions){
            // Message Chain, Inappropriate Intimacy, Feature Envy
            Set<Book> bookKeys = transaction.getBooks().keySet();
            for (Book book: bookKeys){
                sum += book.getUnitPrice() * transaction.getBooks().get(book);
            }
        }
        return sum;
    }
}
