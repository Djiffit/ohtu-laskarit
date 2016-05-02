package statistics;

import statistics.Player;
import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

public class QueryBuilder {

    private Matcher m;

    public QueryBuilder() {
        m = null;
    }

    QueryBuilder playsIn(String tiimi) {
        if (m == null) {
            m = new And(new PlaysIn(tiimi)
            );
        } else {
            m = new And(m,
                    new PlaysIn(tiimi)
            );
        }
        return this;
    }

    QueryBuilder hasAtLeast(int luku, String juttu) {
        if (m == null) {
            m = new And(new HasAtLeast(luku, juttu)
            );
        } else {
            m = new And(m,
                    new HasAtLeast(luku, juttu)
            );
        }
        return this;
    }

    QueryBuilder hasFewer(int luku, String juttu) {
        if (m == null) {
            m = new And(new HasFewerThan(luku, juttu)
            );
        } else {
            m = new And(m,
                    new HasFewerThan(luku, juttu)
            );
        }
        return this;
    }

    public Matcher build() {
        Matcher returni = m;
        m = null;
        return returni;
    }

    QueryBuilder oneOf(Matcher m1, Matcher m2) {
        m = new Or(m1,
                m2
        );
        return this;
    }
}
