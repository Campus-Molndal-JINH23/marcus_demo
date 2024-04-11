package se.campusmolndal.unitweb_demo.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank;
    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @AfterEach
    void tearDown() {
        bank = null;
    }

    @ParameterizedTest
    @CsvSource({"100, true, 100", "200, true, 200", "300, true, 300", // Positiv
                "-100, false, 0", "-2, false, 0", "-3000, false, 0",  // Negativ
                "0.1,true,0.1","0.0001,true,0.0001", "-0,false,0"     // Edge cases
    })
    public void TestDeposit(double amount, boolean expected, double expectedBalance) {
        // Arrange

        // Act
        boolean result = bank.deposit(amount);

        // Assert
        assertEquals(expected, result);
        assertEquals(expectedBalance, bank.getBalance());
    }

    @ParameterizedTest
    @CsvSource({
            "50, true, 50","10, true, 90","5, true, 95", // positiv
            "200, false, 100", "-50, false, 100", "0, false, 100", "0.1, true, 99.9", "-0.1, false, 100", "-100, false, 100", // Negativ
            "100, true, 0", "0.0001, true, 99.9999" // Edge cases
    })
    public void TestWithdraw(double amount, boolean expected, double expectedBalance) {
        // Arrange
        bank = new Bank(100);

        // Act
        boolean result = bank.withdraw(amount);

        // Assert
        assertEquals(expected, result,     "Sent " + amount + "and expected "+ expectedBalance+", Expected: " + expected + " but got: " + result);
        assertEquals(expectedBalance, bank.getBalance(), "Expected: " + expectedBalance + " but got: " + bank.getBalance());
    }


}