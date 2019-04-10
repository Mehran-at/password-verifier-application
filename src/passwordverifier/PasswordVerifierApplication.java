package passwordverifier;

public class PasswordVerifierApplication {
    public static void main(String[] args) {

        PasswordVerifier passwordVerifier = new PasswordVerifier();
        GetPassword getPassword = new GetPassword();
        System.out.println(passwordVerifier.verify(getPassword.getPassword()));
    }
}

//      Password verifier
//      Create a Password verifications class called PasswordVerifier. It has the verify method that receives the password and returns a boolean that states whether it is strong enough or not.
//          Part 1
//          The verify method has the following verifications:
//              1. password should be larger than 8 chars
//              2. password should not be null
//              3. password should have one uppercase letter at least
//              4. password should have one lowercase letter at least
//              5. password should have one number at least

//          Part 2
//          Add feature: password is OK if at least three of the previous conditions is true.

//          Part 3
//          Add feature: password is never OK if item 1.4 is not true.