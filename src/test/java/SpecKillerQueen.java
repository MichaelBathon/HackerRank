import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/25/16.
 */
public class SpecKillerQueen {
    KillerQueen queenie;
    int[] testArray = {1,1,3,1};

    @Before
    public void setUp(){
        queenie = new KillerQueen();
    }

    @Test
    public void testQueensThreatFinder(){
        int expected = 0;
        int actual = queenie.queensThreatFinder(testArray);

        assertEquals("Fails if it doesn't find the maximum number of threats", expected, actual);
    }


}
