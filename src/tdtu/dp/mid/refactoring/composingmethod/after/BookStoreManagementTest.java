package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class BookStoreManagementTest {
    public static void main(String[] args) {
        // ====== AUTHOR ======
        Author authorA = new Author("Nguyen Nhat Anh"
                , new InputDate(1955, 5, 7)
                ,"Quang Name"
                , "Viet Nam"
                , "Male");
        Author authorB = new Author("J. K. Rowling"
                , new InputDate(1965, 7, 31)
                ,"Yate"
                , "Vuong Quoc Anh"
                , "Female");
        Author authorC = new Author("Fujiko F. Fujio"
                , new InputDate(1933, 12, 1)
                ,"Toyama"
                , "Nhat Ban"
                , "Male");
        Author authorD = new Author("Arthur Conan Doyle"
                , new InputDate(1859, 5, 22)
                ,"Edinburgh"
                , "Vuong Quoc Anh"
                , "Male");
        Author authorE = new Author("Thuong Thai Vi"
                , new InputDate()
                ,""
                , "Trung Quoc"
                , "Female");
        Author authorF = new Author("Bill Bryson"
                , new InputDate(1951, 12, 8)
                ,"Des Moines, Iowa"
                , "Hoa Ky"
                , "Male");
        Author authorH = new Author("ELLE"
                , new InputDate()
                ,""
                , "Phap"
                , "");
        Author authorK = new Author("Nguyen Thuc Thuc Phuong"
                , new InputDate()
                ,""
                , "Viet Nam"
                , "");
        Author authorI = new Author("Le Linh"
                , new InputDate(1974)
                ,""
                , "Viet Nam"
                , "Male");

        // ====== BOOK CATEGORY ======
        BookCategory comic = new BookCategory("C001","Comic");
        BookCategory magazine = new BookCategory("M001","Magazine");
        BookCategory novel = new BookCategory("N001","Novel");
        BookCategory manga = new BookCategory("C002","Manga");
        BookCategory howto = new BookCategory("H001","How-to");
        BookCategory science = new BookCategory("S001","Science");
        BookCategory fiction = new BookCategory("F001","Fiction");

        // ====== BOOK  ======
        Book book1 = new Book("B001"
                , 120000
                , "quyen"
                , "Luoc su van vat"
                , new InputDate(2003, 2, 4)
                , "Khoa hoc xa hoi"
                , 100
                , science
                , authorF);
        Book book2 = new Book("B002"
                , 100000
                , "quyen"
                , "Toi thay hoa vang tren co xanh"
                , new InputDate(2018)
                , "Tre"
                , 50
                , novel
                , authorA);
        Book book3 = new Book("B003"
                , 60800
                , "quyen"
                , "Ben xe"
                , new InputDate(2020)
                , "Van hoc"
                , 30
                , novel
                , authorE);
        Book book4 = new Book("B004"
                , 558900
                , "quyen"
                , "Harry Potter: The Artifact Vault"
                , new InputDate(2016, 6, 14)
                , "Harper Design"
                , 10
                , fiction
                , authorB);
        Book book5 = new Book("B005"
                , 16200
                , "quyen"
                , "Doraemon Plus: ep 4"
                , new InputDate(2019)
                , "Kim Dong"
                , 150
                , manga
                , authorC);
        Book book6 = new Book("B006"
                , 16200
                , "quyen"
                , "Nau An Thong Minh - Tap 2: Dung De Thucc Pham Tro Thanh Moi Nguy Hai"
                , new InputDate(2019)
                , "The gioi"
                , 100
                , howto
                , authorK);
        Book book7 = new Book("B007"
                , 16200
                , "quyen"
                , "Than dong dat viet: tap 185"
                , new InputDate(2015)
                , "Dai Hoc Su Pham"
                , 100
                , comic
                , authorI);
        Book book8 = new Book("B007"
                , 300000
                , "quyen"
                , "ELLE Thang 3/2022 - MAKE IT COOL"
                , new InputDate(2022, 3)
                , "ELLE"
                , 100
                , magazine
                , authorH);

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);

        // ====== CUSTOMER CATEGORY ======
        CustomerCategory customerCategory1 = new CustomerCategory("CC001", "Normal", 0);
        CustomerCategory customerCategory2 = new CustomerCategory("CC002", "Silver", 0.05);
        CustomerCategory customerCategory3 = new CustomerCategory("CC003", "Gold", 0.2);
        CustomerCategory customerCategory4 = new CustomerCategory("CC004", "Diamond", 0.5);
        CustomerCategory customerCategory5 = new CustomerCategory("CC005", "Ruby", 0.75);

        // ====== CUSTOMER ======
        Customer customer1 = new Customer(customerCategory1
                , "0917004354"
                , "Tran Nguyen Truong"
                , new InputDate(2001)
                , "Quan 7"
                , "Male");
        Customer customer2 = new Customer(customerCategory2
                , "0917004355"
                , "Vo Tuong Vi"
                , new InputDate(2001, 2, 22)
                , "Quan 3"
                , "Female");
        Customer customer3 = new Customer(customerCategory5
                , "0917004355"
                , "Nguyen Thanh Phuoc"
                , new InputDate()
                , ""
                , "Male");

        Set<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        // ====== POSITION ======
        Position position1 = new Position("P001", "Manager");
        Position position2 = new Position("P002", "Thu ngan");

        // ====== STAFF ======
        Staff staff1 = new Staff(12000000
                , "Nguyen Huong Lan"
                , new InputDate(2001)
                , "Quan 7"
                , "Female"
                , position2
                ,"ST001");
        Staff staff2 = new Staff(20000000
                , "Tran Thi Phuong"
                , new InputDate(1996)
                , "Quan 1"
                , "Female"
                , position1
                ,"ST002");
        Staff staff3 = new Staff(12000000
                , "Vo Van Quyet"
                , new InputDate(2000)
                , "Quan 72"
                , "Male"
                , position2
                ,"ST003");

        Set<Staff> staffs = new HashSet<>();
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(staff3);

        // ====== ITEM ======
        Item itemA1 = new Item(book1, 1);
        Item itemA2 = new Item(book2, 2);
        Item itemB1 = new Item(book3, 1);
        Item itemC1 = new Item(book1, 3);
        Item itemC2 = new Item(book5, 1);
        Item itemC3 = new Item(book7, 4);

        // ====== SHOPPING CART ======
        ShoppingCart cartA = new ShoppingCart();
        ShoppingCart cartB = new ShoppingCart();
        ShoppingCart cartC = new ShoppingCart();

        cartA.addItem(itemA1);
        cartA.addItem(itemA2);
        cartB.addItem(itemB1);
        cartC.addItem(itemC1);
        cartC.addItem(itemC1);
        cartC.addItem(itemC1);

        // ====== BOOK CATEGORY ======
        Transaction transactionA = new Transaction(customer1
                , staff1
                , cartA
                , new Momo("ViVo", "0917004354"));
        Transaction transactionB = new Transaction(customer2
                , staff3
                , cartB
                , new Cash());
        Transaction transactionC = new Transaction(customer3
                , staff3
                , cartC
                , new CreditCard("Nguyen Van A", "2345678", "123", new InputDate(2025, 7)));

        Set<Transaction> transactions = new HashSet<>();
        transactions.add(transactionA);
        transactions.add(transactionB);
        transactions.add(transactionC);

        // ====== BOOK STORE ======
        BookStore bookStore = new BookStore
                .BookStoreBuilder()
                .name("FAHASA")
                .address("Quan 1")
                .books(books)
                .staffs(staffs)
                .customers(customers)
                .transactions(transactions)
                .build();

        for(Transaction transaction: bookStore.getTransactions()){
            System.out.println(transaction.toString());
        }
    }
}
