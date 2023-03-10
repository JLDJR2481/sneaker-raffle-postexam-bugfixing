package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EntryTest {

    Entry entry = new Entry("itselxulosuper@yahoo.es");
    Entry secondEntry = new Entry("squanchy@closet.in");

    @Test
    public void constructorTest() {

        entry.payment("first@paypal.com");
        secondEntry.payment("squanchy@paypal.com");

        assertNotEquals(entry, secondEntry);

    }

    @Test
    public void totalTest() {
        Raffle sneaker = new Sneaker("Puma Crap To Craft", "Yellow", 200.00d);

        entry.setTotal(sneaker.price());

        assertEquals(entry.getTotal(), sneaker.price(), 0);
    }

    @Test
    public void paymentTest() {
        entry.payment("itselxulosuper@paypal.com");

        assertEquals("itselxulosuper@paypal.com", entry.payment());
    }

    @Test
    public void emailTest() {
        assertEquals(entry.email, entry.email());
    }

    @Test
    public void equalsTest() {
        Entry firstEntry = new Entry("itselxulosuper@gmail.com");
        Entry secondEntry = new Entry("notelxulosuper@gmail.com");

        firstEntry.payment("hello@paypal.com");
        secondEntry.payment("hello@paypal.com");

        assertTrue(firstEntry.equals(secondEntry));

        Entry thirdEntry = new Entry("elxulosuper@gmail.com");
        thirdEntry.payment("newpayment@paypal.com");

        assertFalse(thirdEntry.equals(firstEntry));

    }

    @Test
    public void hashCodeTest() {

        Entry firstEntry = new Entry("realemail@gmail.com");
        firstEntry.payment("realpayment@paypal.com");

        Entry secondEntry = new Entry("realemail@gmail.com");
        secondEntry.payment("realpayment@paypal.com");

        Entry thirdEntry = new Entry("newrealemail@gmail.com");
        thirdEntry.payment("realpayment@paypal.com");

        assertEquals(firstEntry.hashCode(), secondEntry.hashCode());

        assertNotEquals(firstEntry.hashCode(), thirdEntry.hashCode());

    }

}
