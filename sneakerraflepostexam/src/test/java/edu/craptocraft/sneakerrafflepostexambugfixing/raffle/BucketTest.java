package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BucketTest {

    private Bucket bucket;

    @Before
    public void setup() {
        this.bucket = new Bucket();

    }

    @Test
    public void duplicateEntryTest() {
        Entry firstEntry = new Entry("firstemail@gmail.com");
        firstEntry.setUserName("First");
        firstEntry.setSize(Sizes.TREINTAYNUEVE);
        firstEntry.setAddress("First Street");
        firstEntry.payment("first@paypal.com");
        bucket.add(firstEntry);
        assertEquals(bucket.totalEntries(), 1, 0);

        Entry secondEntry = new Entry("secondemail@gmail.com");
        secondEntry.setUserName("Second");
        secondEntry.setSize(Sizes.TREINTAYNUEVE);
        secondEntry.setAddress("Second Street");
        secondEntry.payment("second@paypal.com");
        bucket.add(secondEntry);
        assertFalse(secondEntry.equals(firstEntry));

        assertEquals(bucket.totalEntries(), 2, 0);

        Entry duplicateEntry = new Entry("thirdemail@gmail.com");
        duplicateEntry.setUserName("Third");
        duplicateEntry.setSize(Sizes.TREINTAYNUEVE);
        duplicateEntry.setAddress("Third Street");
        duplicateEntry.payment("first@paypal.com");

        assertTrue(duplicateEntry.equals(firstEntry));
        bucket.add(duplicateEntry);

        assertNotEquals(bucket.totalEntries(), 3, 0);
        assertEquals(bucket.totalEntries(), 2, 0);

    }

    @Test
    public void addAndDeleteTest() {
        Entry firstEntry = new Entry("firstemail@gmail.com");
        firstEntry.setUserName("First");
        firstEntry.setSize(Sizes.TREINTAYNUEVE);
        firstEntry.setAddress("First Street");
        firstEntry.payment("first@paypal.com");

        Entry secondEntry = new Entry("secondemail@gmail.com");
        secondEntry.setUserName("Second");
        secondEntry.setSize(Sizes.TREINTAYNUEVE);
        secondEntry.setAddress("Second Street");
        secondEntry.payment("second@paypal.com");

        Entry thirdEntry = new Entry("thirdemail@gmail.com");
        thirdEntry.setUserName("Third");
        thirdEntry.setSize(Sizes.TREINTAYNUEVE);
        thirdEntry.setAddress("Third Street");
        thirdEntry.payment("third@paypal.com");

        bucket.add(firstEntry);

        assertEquals(bucket.totalEntries(), 1, 0);

        bucket.add(secondEntry);
        bucket.add(thirdEntry);

        assertEquals(bucket.totalEntries(), 3, 0);

        bucket.delete(firstEntry);

        assertNotEquals(bucket.totalEntries(), 0, 1);

        assertEquals(bucket.totalEntries(), 2, 1);

    }

}
