package io.github.nyaryu.brownie;

import com.google.common.math.DoubleMath;

import java.text.DecimalFormat;

public class DecimalUtil {

    /**
     * Converts a double value to a string with the specified precision, removing trailing zeros if present.
     *
     * @param number
     * @param precisionLimit
     * @return
     */
    public static String roundDecimalPrecision(double number, int precisionLimit) {
        String result = "";

        StringBuilder pattern = new StringBuilder();
        pattern.append("0");

        if (!DoubleMath.isMathematicalInteger(number) && precisionLimit != 0) {
            pattern.append(".");
            for (int i = 0; i < precisionLimit; i++) {
                pattern.append("#");
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat(pattern.toString());
        result = decimalFormat.format(number);

        return result;
    }

}
