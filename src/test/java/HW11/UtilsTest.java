package HW11;

import org.redRover.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Utils.sum(2, 4), 6);
    }
    @Test
    public void testabbr(){
        Assert.assertEquals(Utils.abbr("1234567890", 10),"1234567890");
    }
}
