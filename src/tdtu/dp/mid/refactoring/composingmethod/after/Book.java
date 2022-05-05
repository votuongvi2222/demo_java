package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class Book {

    private String code;
    private int unitPrice;
    private String unit;

    private String title;
    private InputDate publishingYear;
    private String publishingCompany;
    private int quantity;

    // thay the bien thanh object Primitive Obsession
    private BookCategory category;
    private Author author;

    public Book(){};

    public Book(String code, int unitPrice, String unit, String title
            , InputDate publishingYear, String publishingCompany
            , int quantity, BookCategory category, Author author) {
        this.code = code;
        this.unitPrice = unitPrice;
        this.unit = unit;
        this.title = title;
        this.publishingYear = publishingYear;
        this.publishingCompany = publishingCompany;
        this.quantity = quantity;
        this.category = category;
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public InputDate getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(InputDate publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return code.equalsIgnoreCase(book.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", unitPrice=" + unitPrice +
                ", unit='" + unit + '\'' +
                ", title='" + title + '\'' +
                ", publishingYear=" + publishingYear +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", quantity=" + quantity +
                ", category=" + category +
                ", author=" + author +
                '}';
    }
}
