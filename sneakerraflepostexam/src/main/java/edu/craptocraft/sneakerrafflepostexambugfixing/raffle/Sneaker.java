package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Sneaker implements Raffle {

    public String style;
    public String name;
    public Double price;

    public Set<String> sizes = new LinkedHashSet<>();
    private final Bucket bucket = new Bucket();

    public Sneaker() {
    };

    public Sneaker(String name, String style, Double price) {
        this.style = style;
        this.name = name;
        this.price = price;
    }

    public Double price() {
        return this.price;
    }

    public void sizesRun(Sizes initial, Sizes last) {

        this.sizes = Sizes.getSizes(initial, last);
    }

    public Set<String> sizes() {
        return this.sizes;
    }

    @Override
    public void register(Entry... entries) {
        for (Entry entry : entries) {
            this.bucket.add(entry);
        }

    }

    @Override
    public void cancel(Entry... entries) {
        this.bucket.delete(entries);
    }

    @Override
    public Integer totalEntries() {
        return this.bucket.totalEntries();
    }

    @Override
    public String listEntries() {
        return this.bucket.listEntries();
    }

    @Override
    public String toString() {
        StringBuilder sneakerString = new StringBuilder();

        sneakerString.append("\n\t\t" + this.name);
        sneakerString.append("\n\t\t" + this.style);
        sneakerString.append("\n\t\t" + this.price + " €");
        sneakerString.append("\n\t\t" + this.sizes);

        return sneakerString.toString();
    }

    @Override
    public Entry draw() {
        Optional<Entry> winner = this.bucket.draw();

        return winner.orElse(new Entry());

    }
}
