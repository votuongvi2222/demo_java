package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class Item {
    private Book book;
    private int quantity;

    public Item(){}

    public Item(Book book, int quantity){
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateItemTotal(){
        return book.getUnitPrice()*quantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return book.equals(item.getBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(book);
    }

    @Override
    public String toString() {
        return "Item{" +
                "book=" + book +
                ", quantity=" + quantity +
                '}';
    }
}
