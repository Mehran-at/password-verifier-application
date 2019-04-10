package passwordverifier;


public class PasswordVerifier {
    PasswordNull passwordNull = new PasswordNull();
    PasswordLength passwordLength = new PasswordLength();
    PasswordHasUppercase passwordHasUppercase = new PasswordHasUppercase();
    PasswordHasLowercase passwordHasLowercase = new PasswordHasLowercase();
    PasswordHasDigit passwordHasDigit = new PasswordHasDigit();
    CheckConditions checkConditions = new CheckConditions();

    Boolean verify(String password) {
        return passwordHasLowercase.verify(password) &&
                checkConditions.checkBooleansConditions(passwordNull.verify(password),
                        passwordLength.verify(password),
                        passwordHasDigit.verify(password),
                        passwordHasLowercase.verify(password),
                        passwordHasUppercase.verify(password));
    }


}