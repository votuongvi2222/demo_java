package tdtu.dp.mid.refactoring.composingmethod.after;

import java.util.regex.Pattern;

public class PhoneNumberValidator {

    private static final String pattern = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    public static boolean isValid(String phoneNumber){
        return Pattern.compile(pattern).matcher(phoneNumber).matches();
    }
}
