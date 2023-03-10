package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

public interface Raffle {

    Double price();

    void sizesRun(Sizes initial, Sizes last);

    void register(Entry... entries);

    void cancel(Entry... entries);

    Integer totalEntries();

    String listEntries();

    Entry draw();

}
