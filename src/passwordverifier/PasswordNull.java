package passwordverifier;


public class PasswordNull implements Verfication {

    //  password must not be null
    @Override
    public Boolean verify(String password) {
        return password != null;
    }
}
