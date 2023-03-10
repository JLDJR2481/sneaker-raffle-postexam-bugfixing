package edu.craptocraft.sneakerrafflepostexambugfixing.GUI;

import edu.craptocraft.sneakerrafflepostexambugfixing.raffle.Raffle;
import edu.craptocraft.sneakerrafflepostexambugfixing.raffle.Entry;

public class GUI {

    public GUI() {
    };

    public static void drawSneaker(Raffle sneaker) {
        System.out.println(
                "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +
                        "\t\t" + sneaker.toString());
    }

    public static void drawEntry(Entry entry) {
        System.out.println(entry.toString());
    }

    public static void drawWinner(Entry winner) {
        StringBuilder winnerEntry = new StringBuilder();

        winnerEntry.append("\n\t\t¡¡ You are the winner !!");
        winnerEntry.append(winner.toString());

        System.out.print(winnerEntry.toString());
    }
}
