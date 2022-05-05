package tdtu.dp.mid.refactoring.composingmethod.after;

public class InputDate {
    private int year;
    private int month;
    private int day;

    private boolean isKnownYear = false;
    private boolean isKnownMonth = false;
    private boolean isKnownDay = false;

    public InputDate(int year, int month, int day){
        setDate(year, month, day);
    }

    public InputDate(int year, int month){
        setDate(year, month);

    }

    public InputDate(int year){
        setDate(year);

    }

    public InputDate(){}

    public void setDate(int year, int month, int day){
        if(DateValidator.isValid(year, month, day)){
            this.year = year;
            this.month = month;
            this.day = day;
            isKnownYear = isKnownMonth = isKnownDay = true;
            return;
        }
        setDate(year, month);
    }

    public void setDate(int year, int month){
        if(DateValidator.isValid(year, month, 1)){
            this.year = year;
            this.month = month;
            this.day = 1;
            isKnownYear = isKnownMonth = true;
            return;
        }
        setDate(year);
    }

    public void setDate(int year){
        if(DateValidator.isValid(year, 1, 1)){
            this.year = year;
            this.month = 1;
            this.day = 1;
            isKnownYear = true;
            return;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public boolean isKnownYear() {
        return isKnownYear;
    }

    public boolean isKnownMonth() {
        return isKnownMonth;
    }

    public boolean isKnownDay() {
        return isKnownDay;
    }

    @Override
    public String toString() {
        if (isKnownYear)
            if (!isKnownMonth)
                return "yyyy: " + year;
            else if (!isKnownDay)
                return "yyyy/m: " + year + "/" + month;
            else
                return "yyyy/m/d: " + year + "/" + month + "/" + day;
        return "Unknown";
    }
}
