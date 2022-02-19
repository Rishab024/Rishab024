import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class anagramTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before");

    }



    @Test
    public void isAnagram() {

        assertEquals(true,anagram.isAnagram("abcd","dcba"));

    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }
}