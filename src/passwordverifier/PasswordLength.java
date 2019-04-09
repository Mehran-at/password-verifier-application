package passwordverifier;

public class PasswordLength {
    protected Boolean checkLength(String password) {
        return password.length() > 8;
    }
}
