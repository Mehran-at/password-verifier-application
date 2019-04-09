package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PasswordVerifierTest {

    @ParameterizedTest
    @CsvSource({
            "sdfxdfs, false",
            "sdfxdfsr, false",
            "sdfxdfsrw, true",
            "sdfxdfsdfs, true",
            "we, false",
            "34543n56kjetngd, true"
    })
    void verify(String password, Boolean expected) {
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        Boolean actual = passwordVerifier.verify(password);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void verifyWithNull() {
        String password = null;
        PasswordVerifier passwordVerifier = new PasswordVerifier();
        Boolean actual = passwordVerifier.verify(password);
        Boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}