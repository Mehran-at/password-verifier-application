package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordHasLowercaseTest {
    PasswordHasLowercase passwordHasLowercase = new PasswordHasLowercase();

    @ParameterizedTest
    @CsvSource({
            "sdfsdfsf, true",
            "asdasda, true",
            "WSFSDFSF, false"
    })
    void hasLowercase(String password, Boolean expected) {
        Boolean actual = passwordHasLowercase.hasLowercase(password);
        Assertions.assertEquals(expected, actual);
    }
}