package se.kibar;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankomatTest {

    @Test
    public void loginTest() {
        Bankomat testBankomat = new Bankomat();

        Account testAccount = new Account(2000.0, "1234");
        String testPinCode1 = "1234";
        String testPinCode2 = "0582";

//        assertTrue(testAccount.getPinCode().equals(testPinCode1));
//        assertFalse(testAccount.getPinCode().equals(testPinCode2));

        assertTrue(testBankomat.login(testAccount, testPinCode1));

    }

    @Test
    public void addAccount() {
        Bankomat testBankomat = new Bankomat();
        Account testAccount = new Account(1000, "1234");

        testBankomat.addAccount(testAccount);

        assertEquals(testAccount, testBankomat.getAccount((0)));

    }
}