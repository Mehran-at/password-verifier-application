package passwordverifier;

public interface What {
    Boolean checkBooleansConditions(Boolean notNull, Boolean length, Boolean oneDigit, Boolean hasLowercase,
                                    Boolean hasUppercase);
}
