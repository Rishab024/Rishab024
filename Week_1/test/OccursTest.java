
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class OccursTest {

   occurs obj=new occurs();



    @Test
    public void occuf() {
        HashMap<Character,Integer> res=obj.occu("java");
        Assert.assertSame(res.get('a'),2);
        Assert.assertSame(res.get('j'),1);
        Assert.assertSame(res.get('v'),1);


    }
}