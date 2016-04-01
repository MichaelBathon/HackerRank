import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 3/6/16.
 */
public class JPMExam2Test {

    @Test
    public void testParseSumBinaryNumbers() throws Exception {
       JPMExam2 tester = new JPMExam2();

        String expected = "1000";
        String actual = tester.parseSumBinaryNumbers("111 1");

        assertEquals("Fails if it doesn't return the string representation of the binary numbers summed together", expected, actual);
    }

    @Test
    public void testCheckIfRectanglesOverlap(){

        boolean expected = true;
        boolean actual = JPMExam2.checkIfRectanglesOverlap("1 1 1 1 -1 -1 3 3");

        assertEquals("fails if it doesn't find whether the rectangles have matching points", expected, actual);

    }

    @Test
    public void testBinaryConverter() throws Exception {
        JPMExam2 testObj = new JPMExam2();

        String expected = "100000";
        String actual = testObj.binaryConverter("11110", "10");

        assertEquals("Fails if it doesn't return the string representation of the binary numbers summed together", expected, actual);
    }
}