package edu.craptocraft.sneakerrafflepostexambugfixing.raffle;

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

public enum Sizes {

    TREINTAYNUEVE("6.5 US", "39 EU"),
    CUARENTA("7.0 US", "40 EU"),
    CUARENTAYMEDIO("7.5 US", "40.5 EU"),
    CUARENTAYUNO("8.0 US", "41 EU"),
    CUARENTAYDOS("8.5 US", "42 EU"),
    CUARENTAYDOSYMEDIO("9.0 US", "42.5 EU"),
    CUARENTAYTRES("9.5 US", "43 EU");

    public String USsize;
    public String EUsize;

    Sizes(String USsize, String EUsize) {
        this.USsize = USsize;
        this.EUsize = EUsize;
    }

    public String getUSsize() {
        return this.USsize;
    }

    public static Set<String> getSizes(Sizes initial, Sizes last) {

        EnumSet<Sizes> sizes = EnumSet.range(initial, last);

        Set<String> sneakerSizes = new LinkedHashSet<>();

        for (Sizes size : sizes) {
            String individualSize = size.getUSsize().toString();

            sneakerSizes.add(individualSize);
        }

        return sneakerSizes;

    }

}
