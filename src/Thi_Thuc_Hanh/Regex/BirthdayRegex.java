package Thi_Thuc_Hanh.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BirthdayRegex {
    public static final String birthdayRegex = "^\\d{4}-\\d{2}-\\d{2}$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(birthdayRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
