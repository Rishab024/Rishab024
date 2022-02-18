import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class largst2Test {
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }


    @Test
    public void fdMax() {
        //largst2Test a=new largst2Test();

        assertEquals(2, largst2.fndmax(new int[]{0, 1, 2, 3}));

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }
}





