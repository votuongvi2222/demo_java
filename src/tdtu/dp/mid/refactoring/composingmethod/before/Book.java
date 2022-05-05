package tdtu.dp.mid.refactoring.composingmethod.before;

public class Book {
    private String code;
    private int unitPrice;
    private String unit;

    private String title;
    private int publishingYear;
    private String publishingCompany;
    private int quantity;
    // Primitive Obsession -> Khó hiểu, không dễ làm việc
    private int category;
    private Author author;

    public Book(){};

    public Book(String code, int unitPrice, String unit, String title, int publishingYear, String publishingCompany, int quantity, int category, Author author) {
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

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
                ", author=" + author.toString() +
                '}';
    }
}
