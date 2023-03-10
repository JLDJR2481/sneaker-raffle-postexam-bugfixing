package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.Test;

public class SizesTest {

    @Test
    public void getUSSizeTest() {
        Sizes size = Sizes.CUARENTAYDOS;
        assertNotNull(size);

        assertEquals("8.5 US", size.getUSsize());

        Sizes secondSize = Sizes.CUARENTAYTRES;

        assertEquals("9.5 US", secondSize.getUSsize());

    }

    @Test
    public void getSizesTest() {

        Set<String> sizes = Sizes.getSizes(Sizes.CUARENTAYUNO, Sizes.CUARENTAYDOSYMEDIO);

        assertNotNull(sizes);

        assertEquals(3, sizes.size());

        assertEquals(Sizes.getSizes(Sizes.CUARENTAYUNO, Sizes.CUARENTAYDOSYMEDIO), sizes);

        Set<String> allSizes = Sizes.getSizes(Sizes.TREINTAYNUEVE, Sizes.CUARENTAYTRES);

        assertNotEquals(sizes, allSizes);

        assertEquals(7, allSizes.size());
    }

}
