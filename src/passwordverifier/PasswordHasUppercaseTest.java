package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordHasUppercaseTest {
    PasswordHasUppercase passwordHasUppercase = new PasswordHasUppercase();

    @ParameterizedTest
    @CsvSource({
            "sdfsdf, false",
            "asdasdASD, true",
            "ASDAFSDADS, true"
    })
    void hasUppercase(String password, Boolean expected) {
        Boolean actual = passwordHasUppercase.verify(password);
        Assertions.assertEquals(expected, actual);
    }
}