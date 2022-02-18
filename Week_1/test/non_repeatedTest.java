import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class non_repeatedTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void ar() {
        assertEquals(20, non_repeated.ar(new int[]{1 , 18, 20, 1 , 14 , 16 , 18 , 9 , 0}));

    }



    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

}