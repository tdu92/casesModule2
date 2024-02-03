package validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContractValidate {
    private static Pattern pattern;
    static Scanner scanner = new Scanner(System.in);
    private static final String DATE_REGEX = "^[0-3][0-9]/[0-1][0-9]/202[4-9]$";

    public ContractValidate() {
        pattern = Pattern.compile(DATE_REGEX);
    }

    public static boolean checkDate(String date) {
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    public static String validate() {
        while (true) {
            System.out.println("Enter date");
            String date = scanner.nextLine();
            if (checkDate(date)) {
                return date;
            }

        }
    }
}
