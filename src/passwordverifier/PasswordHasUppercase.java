package passwordverifier;

public class PasswordHasUppercase {
    protected Boolean hasUppercase(String password) {
        for (int element = 0; element < password.length(); element++) {
            char letters = password.charAt(element);
            if (Character.isUpperCase(letters)) {
                return true;
            }
        }
        return false;
    }
}
