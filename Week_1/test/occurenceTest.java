import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;

public class occurenceTest {
    private static Occurence tester;


    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after");

    }

    @Test
    public void occ1() {
        String str1="j=1 a=2 v=1";
        Occurence ob1=new Occurence();
        String str2 = "java";

        //ob1.occ("java");
        assertEquals(str1,Occurence.occ(str2));


    }
}