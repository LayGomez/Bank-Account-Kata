import org.example.Account;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    @DisplayName("Test crear cuenta con número unico y saldo inicial")
    void test_CreateAccountWithBalance_thenReturnAccount(){
        Account account = new Account(1000);
        double balance =account.getBalance();
        assertEquals ( 1000,balance);
    }
    @Test
    @DisplayName("Test depositar una cantidad positiva de dinero")
    void test_WhenDepositPositiveAmount_thenReturnBalance() {
        Account account = new Account(1000);
        account.addAmount(500);

        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

    @Test
    @DisplayName("Test depositar una cantidad positiva de dinero")
    void test_WhenDepositNegativeAmount_thenReturnBalance() {
        Account account = new Account(1000);
        account.addAmount(-500);

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    @DisplayName("Test retirar dinero que no sea mayor a los fondos")
    void test_WhenAmountIsMinorOfBalance_thenReturnBalance() {
        Account cuenta = new Account(1500);
        cuenta.withDraw(200);

        double balance = cuenta.getBalance();
        assertEquals(1300, balance);
    }

}
