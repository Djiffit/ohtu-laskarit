package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();
//        Matcher m1 = query.playsIn("PHI")
//                .hasAtLeast(10, "goals")
//                .hasFewer(20, "assists").build();
//
//        Matcher m2 = query.playsIn("EDM")
//                .hasAtLeast(50, "points").build();

//        Matcher m = query.oneOf(m1, m2).build();
//        for (Player player : stats.matches(m)) {
//            System.out.println(player);
//        }
//        for (Player player : stats.matches(m1)) {
//            System.out.println(player);
//        }
//        for (Player player : stats.matches(m2)) {
//            System.out.println(player);
//        }
        Matcher m3
                = query.playsIn("EDM")
                .hasAtLeast(50, "points").build();

        Matcher m4 = query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewer(20, "assists").build();
        Matcher m6 = query.oneOf(m3, m4).build();
        Matcher m7 = query.oneOf(
                query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewer(20, "assists").build(),
                query.playsIn("EDM")
                .hasAtLeast(50, "points").build()
        ).build();
        for (Player player : stats.matches(m7)) {
            System.out.println(player);
        }
//        for (Player player : stats.matches(m3)) {
//            System.out.println(player);
//        }
//        Matcher m5 = new And(new HasAtLeast(50, "points"),
//                new PlaysIn("EDM")
//        );
//        for (Player player : stats.matches(m5)) {
//            System.out.println(player);
//        }


    }
}
