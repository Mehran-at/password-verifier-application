package passwordverifier;


public class PasswordLength implements Verfication {

    //  password's length must be bigger than 8
    @Override
    public Boolean verify(String password) {
        return password.length() > 8;
    }
}
