package HW11;

import org.apache.commons.lang3.StringUtils;
import org.redRover.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Utils.sum(2, 4), 6);
    }
    @Test
    public void testabr(){
        Assert.assertEquals(Utils.abbr("1234567890", 10),"1234567890");
    }
    @Test
    public void test1(){

        Assert.assertEquals(StringUtils.capitalize(null), null);
        Assert.assertEquals(StringUtils.capitalize(""), "");
        Assert.assertEquals(StringUtils.capitalize("cat"), "Cat");
        Assert.assertEquals(StringUtils.capitalize("cAt"), "CAt");
        Assert.assertEquals(StringUtils.capitalize("'cat'"), "'cat'");
    }
}



