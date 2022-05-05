package tdtu.dp.mid.refactoring.composingmethod.after;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class DateValidator {

    public static boolean isValid(final int year, final int month, final int day){
        try{
            LocalDate localDate = LocalDate.of(year, month, day);
        }catch (DateTimeException dateTimeException){
            return false;
        }
        return true;
    }
}
