package passwordverifier;


public class PasswordHasDigit implements Verfication {

    //  password must have at least one lowercase
    @Override
    public Boolean verify(String password) {
        Boolean hasDigit = false;

        for (int element = 0; element < password.length(); element++) {
            char letters = password.charAt(element);
            if (Character.isDigit(letters)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
    }


}
