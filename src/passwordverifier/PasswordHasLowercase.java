package passwordverifier;


public class PasswordHasLowercase implements Verfication {

    //  password must have at least one lowercase
    @Override
    public Boolean verify(String password) {
        for (int element = 0; element < password.length(); element++) {
            char letters = password.charAt(element);
            if (Character.isLowerCase(letters)) {
                return true;
            }
        }
        return false;
    }
}
