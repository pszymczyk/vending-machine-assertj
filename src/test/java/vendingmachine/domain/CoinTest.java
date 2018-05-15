package vendingmachine.domain;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CoinTest {

    @Test
    @Parameters({
            "PENNY, 0.01",
            "NICKEL, 0.05",
            "DIME, 0.10",
            "QUARTER, 0.25",
    })
    public void coinShouldHasExpectedValue(String coin, String expectedValue) {
        //expect
        Assertions.assertThat(Coin.valueOf(coin).getValue()).isEqualTo(new BigDecimal(expectedValue));
    }
}
