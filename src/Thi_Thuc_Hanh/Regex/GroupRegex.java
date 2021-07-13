package Thi_Thuc_Hanh.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupRegex {
    public static final String grounpRegex = "^\\d+$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(grounpRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
