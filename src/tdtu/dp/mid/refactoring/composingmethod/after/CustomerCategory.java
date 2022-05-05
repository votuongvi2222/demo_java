package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class CustomerCategory {
    private String code;
    private String title;
    private double discount;

    public CustomerCategory(){}

    public CustomerCategory(String code, String title, double discount) {
        this.code = code;
        this.title = title;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCategory that = (CustomerCategory) o;
        return code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "CustomerCategory{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", discount=" + discount +
                '}';
    }
}
