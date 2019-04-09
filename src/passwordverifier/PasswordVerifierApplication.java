package passwordverifier;

public class PasswordVerifierApplication {
    public static void main(String[] args) {
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        String password = "l";
        System.out.println(passwordVerifier.verify(password));
    }
}
