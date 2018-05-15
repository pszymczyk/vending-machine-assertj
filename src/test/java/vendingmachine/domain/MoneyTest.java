package vendingmachine.domain;

import java.math.BigDecimal;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    public void shouldAddMoney() {
        //given
        Money money1 = new Money(0.5);
        Money money2 = new Money(0.5);

        //when
        Money result = money1.add(money2);

        //then
        assertThat(result.getValue()).isEqualTo(new BigDecimal("1.00"));
    }
}