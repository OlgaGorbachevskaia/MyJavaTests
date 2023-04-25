package Jen1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
//package Jen1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
;

    public class Jenkins1 extends BaseTest {

        @Test
        public void testSimple() {
            //getDriver().findElement(By.cssSelector(".empty-state-block > h1"))
            WebElement welcomeElement = getDriver().findElement(By.xpath("//div[@class = 'empty-state-block']/h1"));

            Assert.assertEquals(welcomeElement.getText(), "Welcome to Jenkins!");
        }
    }

