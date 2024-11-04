import org.example.Account;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    @DisplayName("Test crear cuenta con número unico y saldo inicial")
    public void  test_CreateAccountWithBalance(){
        Account cuenta = new Account(1234, 1000);
        assertEquals (1000, cuenta.getBalance());
    }

}
