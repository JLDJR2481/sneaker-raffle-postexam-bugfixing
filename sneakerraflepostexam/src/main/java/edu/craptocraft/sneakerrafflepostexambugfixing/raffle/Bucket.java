package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class Bucket {

    private Random rand;

    private final Set<Entry> entries = new HashSet<Entry>();

    Bucket() {
    };

    void add(Entry entry) {
        if (!isDoubleEntry(entry)) {
            entries.add(entry);
        }
    }

    void delete(Entry... entry) {
        this.entries.removeAll(Arrays.asList(entry));
    }

    Integer totalEntries() {
        return this.entries.size();
    }

    String listEntries() {
        return this.entries.stream().map(Entry::email).collect(Collectors.toList()).toString();
    }

    Optional<Entry> draw() {
        this.rand = new Random();

        return this.entries.stream().skip(this.rand.nextInt(entries.size())).findFirst();
    }

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.payment().equalsIgnoreCase(entry.payment()));
    }

}
