package business.concretes;
import java.util.regex.Pattern;

public class UserValidator {

    public static boolean EmailValidator(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }

    public static boolean PasswordValidator(String password) {
        if(password.length() >= 6) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean NameValidator(String firstName,String lastName) {
        if (firstName.length() >= 2 && lastName.length() >= 2) {
            return true;
        }
        else {
            return false;
        }
    }
}
