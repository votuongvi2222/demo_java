package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.HashSet;
import java.util.Set;

public class BookStore {

    private static volatile BookStore instance = null;

    private final String name;
    private final String address;

    private Set<Book> books = new HashSet<>();
    private Set<Staff> staffs = new HashSet<>();
    private Set<Customer> customers = new HashSet<>();
    private Set<Transaction> transactions = new HashSet<>();

    private BookStore(BookStoreBuilder bookStoreBuilder) {
        if(bookStoreBuilder == null)
            throw new IllegalArgumentException("Builder cannot be null");
        if(bookStoreBuilder.name == null)
            throw new IllegalArgumentException("Name cannot be null");
        if(bookStoreBuilder.address == null)
            throw new IllegalArgumentException("Address cannot be null");

        name = bookStoreBuilder.name;
        address = bookStoreBuilder.address;
        books = bookStoreBuilder.books;
        staffs = bookStoreBuilder.staffs;
        customers = bookStoreBuilder.customers;
        transactions = bookStoreBuilder.transactions;
        instance = this;
    }

    private static BookStore createBuilder(BookStoreBuilder bookStoreBuilder){
        if (instance == null) {
            synchronized(BookStore.class) {
                if (instance == null) {
                    instance = new BookStore(bookStoreBuilder);
                }
            }
        }
        return instance;
    }

    public static BookStore getInstance(){
        return instance;
    }

    public String getName() {
        return getInstance().name;
    }

    public String getAddress() {
        return getInstance().address;
    }

    public Set<Book> getBooks() {
        return getInstance().books;
    }

    public Set<Staff> getStaffs() {
        return getInstance().staffs;
    }

    public Set<Customer> getCustomers() {
        return getInstance().customers;
    }

    public Set<Transaction> getTransactions() {
        return getInstance().transactions;
    }

    protected void destroy() {
        instance = null;
    }

    public static final class BookStoreBuilder{
        private String name;
        private String address;

        private Set<Book> books = new HashSet<>();
        private Set<Staff> staffs = new HashSet<>();
        private Set<Customer> customers = new HashSet<>();
        private Set<Transaction> transactions = new HashSet<>();

        public BookStoreBuilder(){
        }

        public BookStoreBuilder name(String input){
            name = input;
            return this;
        }

        public BookStoreBuilder address(String input){
            address = input;
            return this;
        }

        public BookStoreBuilder books(Set<Book> input){
            books = input;
            return this;
        }

        public BookStoreBuilder staffs(Set<Staff> input){
            staffs = input;
            return this;
        }

        public BookStoreBuilder customers(Set<Customer> input){
            customers = input;
            return this;
        }

        public BookStoreBuilder transactions(Set<Transaction> input){
            transactions = input;
            return this;
        }

        public BookStore build(){

            return createBuilder(this);
        }
    }
    public int calculateRevenue(){
        int sum = 0;
        for(Transaction transaction: transactions){
            sum += transaction.getTotalAmount();
        }
        return sum;
    }
}
