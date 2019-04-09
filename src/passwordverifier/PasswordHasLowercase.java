package passwordverifier;

public class PasswordHasLowercase {
    protected Boolean hasLowercase(String password) {
        for (int element = 0; element < password.length(); element++) {
            char letters = password.charAt(element);
            if (Character.isLowerCase(letters)) {
                return true;
            }
        }
        return false;
    }
}
