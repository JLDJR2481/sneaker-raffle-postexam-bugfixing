package edu.craptocraft.sneakerrafflepostexambugfixing.Payment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PaymentTest {
    Payment paypal = new Paypal();

    @Test
    public void autenticationTest() {
        String winner = "squanchy@paypal.com";

        assertTrue(paypal.autentication(winner));

        String falseWinner = "fifth@paypal.com";

        assertFalse(paypal.autentication(falseWinner));

    }

    @Test
    public void payTest() {

        Double total = 150d;

        String trueWinnerWithCredit = "squanchy@paypal.com";

        Double initialCredit = paypal.credit(trueWinnerWithCredit);

        paypal.pay(trueWinnerWithCredit, total);

        Double afterPay = paypal.credit(trueWinnerWithCredit);

        assertNotEquals(initialCredit, afterPay);

        assertEquals(afterPay, 50d, 0);

    }

}
