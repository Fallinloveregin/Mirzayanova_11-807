package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {
    public static void main(String[] args) {


        Comparator<Parties> dataParty = new Comparator<Parties>() {

            @Override
            public int compare(Parties parties, Parties t1) {
                return 0;
            }
        };

        Test2<Parties> parties = new Test2<>();
        parties.add(new Parties(21, "JamBar", 150, "Splash" ));
        parties.add(new Parties(22, "JamBar", 200, "RussianRenecanse"));
        parties.add(new Parties(27, "JamBar", 100, "GoldenHits"));
        parties.add(new Parties(28, "JamBar", 150, "MusicFrom90"));

        parties.top10(new Comparator<Parties>() {

        }

    }
}
