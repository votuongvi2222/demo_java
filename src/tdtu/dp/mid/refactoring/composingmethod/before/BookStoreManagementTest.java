package tdtu.dp.mid.refactoring.composingmethod.before;

import java.util.Hashtable;

public class BookStoreManagementTest {
    public static void main(String[] args) {
        // author1 has a book but null is set to books param
        // age and dob are conflict
        Author author1 = new Author(0, 0, "Author 1"
                , "22-02-1992", 13
                , "19 Nguyen Huu Tho, q7", "VN"
                , "Male", "Manga", 0, null);
        Author author2 = new Author(0, 0, "Author 2"
                , "23-12-1892", -1
                , "NewYork", "My"
                , "Male", "Novel", 0, null);
        Author author3 = new Author(0, 0, "Author 3"
                , "2001", 0
                , "", "VN"
                , "Male", "Fiction", 0, null);

        Book book1 = new Book("A45", 12000
                , "quyen", "Book 1"
                , 2010, "Kim Dong"
                , 200, 1, author1);

        // same code but 2 object
        Book book2 = new Book("a45", 12000
                , "quyen", "Book 1"
                , 2010, "Kim Dong"
                , 200, 1, author1);

        Book book3 = new Book("123", 10000
                , "quyen", "Book 3"
                , 2000, "Kim Dong"
                , 200, 2, author1);

        //
        Customer customer1 = new Customer(2, 0, "Customer 1"
                , "2001", 11
                , "", ""
                , "Female", "", 0);
        Customer customer2 = new Customer(5, 0, "Customer 2"
                , "2023", -1
                , "", ""
                , "Female", "", 0);
        Customer customer3 = new Customer(0, 0, "Customer 3"
                , "1999", 0
                , "Quan 3", ""
                , "Male", "", 0);

        Staff staff1 = new Staff(0, 10000000, "Staff 1"
                , "1890", 20
                , "", ""
                , "Female", "", 3);
        Staff staff2 = new Staff(0, 15000000, "Staff 2"
                , "1990", 20
                , "", ""
                , "Male", "", 1);
        Staff staff3 = new Staff(0, 80000000, "Staff 3"
                , "1994", 21
                , "", ""
                , "Female", "", 3);

        BookStore bookStore = new BookStore();
        bookStore.setAddress("Hoang van thu, quan 3");

        bookStore.getStaffs().add(staff1);
        bookStore.getStaffs().add(staff2);
        bookStore.getStaffs().add(staff3);

        bookStore.getBooks().add(book1);
        bookStore.getBooks().add(book2);
        bookStore.getBooks().add(book3);

        bookStore.getCustomers().add(customer1);
        bookStore.getCustomers().add(customer2);
        bookStore.getCustomers().add(customer3);

        bookStore.setName("BOOK STORE");
        bookStore.getPayments().add(new Payment());

        Hashtable<Book, Integer> boughtBooks = new Hashtable<>();
        boughtBooks.put(book1, 2);
        boughtBooks.put(book2, 1);

        Transaction transaction1 = new Transaction("22/02/2022", "7h"
                , customer1, staff1
                , new Payment(), boughtBooks, 200000);

        boughtBooks.put(book3, 1);
        Transaction transaction2 = new Transaction("1/01/2022", "17h"
                , customer3, staff3
                , new Payment(), boughtBooks, 350000);

        bookStore.getTransactions().add(transaction1);
        bookStore.getTransactions().add(transaction2);

        // Conflict total cost with revenue
        System.out.println(bookStore.calculateRevenue());
    }
}
