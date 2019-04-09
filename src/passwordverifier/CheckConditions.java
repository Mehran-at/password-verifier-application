package passwordverifier;

import java.util.ArrayList;
import java.util.List;

public class CheckConditions implements What {

    @Override
    public Boolean checkBooleansConditions(Boolean notNull, Boolean length, Boolean oneDigit, Boolean hasLowercase, Boolean hasUppercase) {
        List<Boolean> list = new ArrayList<Boolean>();
        list.add(notNull.booleanValue());
        list.add(length.booleanValue());
        list.add(oneDigit.booleanValue());
        list.add(hasLowercase.booleanValue());
        list.add(hasUppercase.booleanValue());
        int count = 0;
        for (boolean value : list) {
            if (value == true) {
                count = count + 1;
            }
        }System.out.println(list);
        return count >= 3;

    }


}
