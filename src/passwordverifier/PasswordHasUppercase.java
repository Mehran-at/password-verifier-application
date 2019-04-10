package passwordverifier;


public class PasswordHasUppercase implements Verfication {

    //  password must have at least one uppercase
    @Override
    public Boolean verify(String password) {
        for (int element = 0; element < password.length(); element++) {
            char letters = password.charAt(element);
            if (Character.isUpperCase(letters)) {
                return true;
            }
        }
        return false;
    }
}
