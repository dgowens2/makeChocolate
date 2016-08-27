package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DTG2 on 08/24/16.
 */
public class StringReverserTest {

    StringReverser reverser;

    @Before
    public void setUp() throws Exception {
        reverser = new StringReverser();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void reverseString() throws Exception {
        String sampleString = "something";
        String reversedString = reverser.reverseString(sampleString);
        System.out.println(reversedString);
        assertEquals("gnihtemos", reversedString);
        //we tell the test (1) what to expect and (2) what we will produce.

    }

//    @Test
//    public void testSimpleReverse() throws Exception {
//        String sample = "sample";
//        String reversed = stringReverser.reserveString(sample);
//        assertEquals("elpmas", reversed);
//    }


}