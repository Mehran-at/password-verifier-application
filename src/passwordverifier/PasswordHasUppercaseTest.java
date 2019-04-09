package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordHasUppercaseTest {
    PasswordHasUppercase passwordHasUppercase = new PasswordHasUppercase();
    @ParameterizedTest
    @CsvSource({
            "sdfsdf, false",
            "asdasdASD, true",
            "ASDAFSDADS, true"
    })
    void hasUppercase(String password, Boolean expected) {
        Boolean actual = passwordHasUppercase.hasUppercase(password);
        Assertions.assertEquals(expected, actual);
    }
}