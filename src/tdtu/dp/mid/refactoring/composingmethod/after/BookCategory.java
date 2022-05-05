package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class BookCategory {
    private String code;
    private String title;

    public BookCategory(){}

    public BookCategory(String code, String title) {
        this.code = code;
        this.title = title;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookCategory that = (BookCategory) o;
        return code.equalsIgnoreCase(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
