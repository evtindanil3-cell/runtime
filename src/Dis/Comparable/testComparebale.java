package Dis.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testComparebale {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player("Charlie", 10, 150));
        players.add(new Player("Alex", 50, 500));
        players.add(new Player("Ben", 10, 300));
        players.add(new Player("Amigo", 10, 150));

        System.out.println("До сортировки");
        System.out.println(players);

        Collections.sort(players);

        System.out.println("После сортировки");
        System.out.println(players);
    }
}
