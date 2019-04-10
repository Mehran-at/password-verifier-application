package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordNullTest {

    PasswordNull passwordNull = new PasswordNull();

    @Test
    void verify() {
        String password = null;
        Boolean actual = passwordNull.verify(password);
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void verifyOne() {
        String password = "sdsdfs";
        Boolean actual = passwordNull.verify(password);
        Boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}