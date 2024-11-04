import org.example.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    @DisplayName("Test crear cuenta con número unico y saldo inicial")
    void test_CreateAccountWithBalance_thenReturnAccount(){
        Account cuenta = new Account(1234, 1000);
        assertEquals (1000, cuenta.getBalance());
    }
    @Test
    @DisplayName("Test depositar una cantidad positiva de dinero")
    void test_WhenDepositPositiveAmount_thenReturnBalance() {
        Account cuenta = new Account(1234,1000);
        double result = cuenta.addAmount(500);
        assertEquals(1500, cuenta.getBalance());
    }

}
