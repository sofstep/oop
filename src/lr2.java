import java.util.regex.*;

public class lr2 {

    public static class PhoneNumberValidator {
        public static void main(String[] args) {
            String[] validPhoneNumbers = {
                    "380505923502", "+380505923502", "+38 050 592 35 02", "+38 (050) 592 35 02", "+38 (050) 592-35-02",
                    "+38 (050) 592-3-502", "(050) 592-35-02", "050 592 35 02", "050 592 35 02", "050 592 3502",
                    "050 592 3 502", "050-592-3-502", "+80 (50) 592 35 02", "380 (50) 592 35 02", "+380 (50) 592 35 02",
                    "+380 (50) 592 35 02", "+380 (50) 592-35-02", "+380 50 592-35-02"
            };

            String regex = "^(\\+?\\d{2})?\\s?(\\(\\d{3}\\)|\\d{3})[-\\s]?\\d{3}[-\\s]?\\d{2}[-\\s]?\\d{2}$";

            Pattern pattern = Pattern.compile(regex);

            System.out.println("Validating phone numbers:");
            for (String phoneNumber : validPhoneNumbers) {
                Matcher matcher = pattern.matcher(phoneNumber);
                if (matcher.matches()) {
                    System.out.println(phoneNumber + " is valid.");
                } else {
                    System.out.println(phoneNumber + " is invalid.");
                }
            }
        }
    }

}

