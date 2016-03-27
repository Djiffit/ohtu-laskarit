
import java.util.ArrayList;
import java.util.List;
import ohtuesimerkki.Player;
import ohtuesimerkki.Reader;
import ohtuesimerkki.Statistics;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StatisticsTest {

    private Statistics stats;

    @Before
    public void setUp() throws Exception {
        Reader readerStub = new Reader() {

            public List<Player> getPlayers() {
                ArrayList<Player> players = new ArrayList<Player>();

                players.add(new Player("Semenko", "EDM", 4, 12));
                players.add(new Player("Lemieux", "PIT", 45, 54));
                players.add(new Player("Kurri", "EDM", 37, 53));
                players.add(new Player("Yzerman", "DET", 42, 56));
                players.add(new Player("Gretzky", "EDM", 35, 89));

                return players;
            }
        };
        this.stats = new Statistics(readerStub);
    }

    @Test
    public void addedPlayersAreOnListAndSearchWorks() {
        assertEquals(stats.search("Semenko").getName(), "Semenko");
        assertEquals(stats.search("Lemieux").getGoals(), 45);
        assertEquals(stats.search("Kurri").getAssists(), 53);
        assertEquals(stats.search("Yzerman").getTeam(), "DET");
        assertEquals(stats.search("Gretzky").getPoints(), 35 + 89);
    }

    /**
     * Test of search method, of class Statistics.
     */
    @Test
    public void testSearchingForNull() {
        assertEquals(stats.search("Nuuskamuikkunen"), null);
    }

    @Test
    public void testAddingPlayersWorks() {
        List<Player> pleijaajat = stats.team("EDM");
        assertEquals(pleijaajat.size(), 3);
    }
    
    @Test
    public void testTopScorers() {
        assertEquals(stats.topScorers(1).get(0).getName(), "Gretzky");
    }

    /**
     * Test of team method, of class Statistics.
     */
//    @Test
//    public void testTeam() {
//        System.out.println("team");
//        String teamName = "";
//        Statistics instance = null;
//        List<Player> expResult = null;
//        List<Player> result = instance.team(teamName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of topScorers method, of class Statistics.
//     */
//    @Test
//    public void testTopScorers() {
//        System.out.println("topScorers");
//        int howMany = 0;
//        Statistics instance = null;
//        List<Player> expResult = null;
//        List<Player> result = instance.topScorers(howMany);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}
