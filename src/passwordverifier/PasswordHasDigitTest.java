package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordHasDigitTest {
    PasswordHasDigit passwordHasDigit = new PasswordHasDigit();

    @ParameterizedTest
    @CsvSource({
            "asdasdfsadf, false",
            "sdasd, false",
            "3425354, true",
            "asda23, true   "
    })
    void hasDigit(String password, Boolean expected) {
        Boolean actual = passwordHasDigit.hasDigit(password);
        Assertions.assertEquals(expected, actual);
    }
}