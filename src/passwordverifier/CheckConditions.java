package passwordverifier;

import java.util.ArrayList;
import java.util.List;

public class CheckConditions implements What {

    @Override
    public Boolean checkBooleansConditions(Boolean notNull, Boolean length, Boolean oneDigit, Boolean hasLowercase, Boolean hasUppercase) {
        List<Boolean> booleanList = new ArrayList<Boolean>();
        booleanList.add(notNull.booleanValue());
        booleanList.add(length.booleanValue());
        booleanList.add(oneDigit.booleanValue());
        booleanList.add(hasLowercase.booleanValue());
        booleanList.add(hasUppercase.booleanValue());
        int count = 0;
        for (boolean value : booleanList) {
            if (value == true) {
                count = count + 1;
            }
        }
        System.out.println(booleanList);
        return count >= 3;

    }


}
