package passwordverifier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckConditionsTest {
    CheckConditions checkConditions = new CheckConditions();

    @ParameterizedTest
    @CsvSource({
            "true, true, false, true, false, true",
            "true, false, false, true, false, false",
    })
    void checkBooleansConditions(Boolean notNull, Boolean length, Boolean oneDigit, Boolean hasLowercase, Boolean hasUppercase, Boolean expected) {
        Boolean actual = checkConditions.checkBooleansConditions(notNull, length, oneDigit, hasLowercase, hasUppercase);
        Assertions.assertEquals(expected, actual);
    }
}