package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.Objects;

public class Position {
    private String code;
    private String title;

    public Position(){

    }

    public Position(String code, String title) {
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
        Position position = (Position) o;
        return code.equalsIgnoreCase(position.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Position{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
