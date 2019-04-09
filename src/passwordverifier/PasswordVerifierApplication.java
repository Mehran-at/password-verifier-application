package passwordverifier;

public class PasswordVerifierApplication {
    public static void main(String[] args) {
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        GetPassword getPassword = new GetPassword();
        System.out.println(passwordVerifier.verify(getPassword.getPassword()));
    }
}
