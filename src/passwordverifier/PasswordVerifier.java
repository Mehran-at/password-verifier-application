package passwordverifier;


public class PasswordVerifier {
    PasswordNull passwordNull = new PasswordNull();
    PasswordLength passwordLength = new PasswordLength();
    PasswordHasUppercase passwordHasUppercase = new PasswordHasUppercase();
    PasswordHasLowercase passwordHasLowercase = new PasswordHasLowercase();
    PasswordHasDigit passwordHasDigit = new PasswordHasDigit();
    CheckConditions checkConditions = new CheckConditions();

    Boolean verify(String password) {
        return passwordHasLowercase.hasLowercase(password) && checkConditions.checkBooleansConditions(passwordNull.checkNull(password), passwordLength.checkLength(password),
                passwordHasDigit.hasDigit(password), passwordHasLowercase.hasLowercase(password),
                passwordHasUppercase.hasUppercase(password));
    }


}