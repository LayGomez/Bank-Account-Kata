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
        Account objectOfAccount = new Account(1234,1000);
        double result = objectOfAccount.addAmount(500);
        assertEquals(1500, result);
    }
    @Test
    @DisplayName("Test Test retirar dinero que no sea mayor a los fondos")
    void test_WhenAmountIsMinorOfBalance_thenReturnBalance() {
        Account objectOfAccount = new Account(1234,1000);
        double result = objectOfAccount.withDraw(200);
        assertEquals(800, result);
    }

}
