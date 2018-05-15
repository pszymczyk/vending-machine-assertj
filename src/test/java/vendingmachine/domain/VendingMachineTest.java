package vendingmachine.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static vendingmachine.domain.Money.money;

public class VendingMachineTest {

    @Test
    public void shouldDisplayInsertACoinWhenReady() {
        //when
        VendingMachine vendingMachine = new VendingMachine();

        //then
        assertThat(vendingMachine.getDisplay()).isEqualTo("INSERT A COIN");
        assertThat(vendingMachine.getBalance()).isEqualTo(money(0));
        assertThat(vendingMachine.getCoinReturnTray()).isEmpty();
    }
}