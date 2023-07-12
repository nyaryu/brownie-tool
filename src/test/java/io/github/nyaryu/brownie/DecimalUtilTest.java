package io.github.nyaryu.brownie;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecimalUtilTest {

    @Test
    void roundDecimalPrecision_should_work() {

        {
            double decimal = 22.22346d;

            String result1 = DecimalUtil.roundDecimalPrecision(decimal, 0);
            assertThat(result1).isEqualTo("22");

            String result2 = DecimalUtil.roundDecimalPrecision(decimal, 1);
            assertThat(result2).isEqualTo("22.2");

            String result3 = DecimalUtil.roundDecimalPrecision(decimal, 2);
            assertThat(result3).isEqualTo("22.22");

            String result4 = DecimalUtil.roundDecimalPrecision(decimal, 4);
            assertThat(result4).isEqualTo("22.2235");
        }

        {
            double decimal = 22d;
            String result = DecimalUtil.roundDecimalPrecision(decimal, 2);
            assertThat(result).isEqualTo("22");
        }

        {
            double decimal = 0.166d;
            String result = DecimalUtil.roundDecimalPrecision(decimal, 2);
            assertThat(result).isEqualTo("0.17");
        }

        {
            double decimal = 21.00d;
            String result = DecimalUtil.roundDecimalPrecision(decimal, 2);
            assertThat(result).isEqualTo("21");
        }

        {
            double decimal = 21.10d;
            String result = DecimalUtil.roundDecimalPrecision(decimal, 2);
            assertThat(result).isEqualTo("21.1");
        }

    }
}
