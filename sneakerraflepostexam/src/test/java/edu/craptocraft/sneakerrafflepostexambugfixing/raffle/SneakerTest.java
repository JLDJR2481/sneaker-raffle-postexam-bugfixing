package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SneakerTest {

    Raffle sneaker = new Sneaker("Puma Craft", "White", 109.99);

    @Test
    public void constructorTest() {

        assertNotNull(sneaker);
    }

    @Test
    public void priceTest() {

        assertNotNull(sneaker.price());
        assertEquals(109.99, sneaker.price(), 0);

    }

}
