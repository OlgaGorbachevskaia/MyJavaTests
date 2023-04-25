package Jen1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Jen1.BaseTest;

public class JavaExpertsNationTests extends BaseTest {
    @Test
    public void testManageTitle() {
        getDriver().findElement(By.cssSelector("a[href='/manage']")).click();

        WebElement manageTitle = getDriver().findElement(By.tagName("h1"));
        WebElement securityTitle = getDriver().findElement(By.cssSelector("#main-panel section:nth-child(6) h2"));

        Assert.assertEquals(manageTitle.getText(), "Manage Jenkins");
        Assert.assertEquals(securityTitle.getText(), "Security");

        WebElement systemConfigurationTitle = getDriver().
                findElement(By.xpath("//*[@id=\"main-panel\"]/section[2]/h2"));

        Assert.assertEquals(systemConfigurationTitle.getText(), "System Configuration");
    }
    @Test
    public void testPeopleTitle() {
        WebElement people = getDriver().findElement(By.xpath("//a[@href='/asynchPeople/']"));
        people.click();

        WebElement peopleTitle = getDriver().findElement(By.tagName("h1"));
        WebElement userid = getDriver().findElement(By.xpath("//a[text()='User ID']"));
        WebElement name = getDriver().findElement(By.xpath("//a[text()=\"Name\"]"));
        WebElement LastCommitActivity = getDriver().findElement(By.xpath("//a[text()=\"Last Commit Activity\"]"));
        WebElement On = getDriver().findElement(By.xpath("//a[text()=\"On\"]"));

        Assert.assertEquals(peopleTitle.getText(), "People");
    }

    @Test
    public void BuildHistoryTitle() {
        WebElement buildHistory = getDriver().findElement(By.xpath("//a[@href='/view/all/builds']"));
        buildHistory.click();

        WebElement peopleTitle = getDriver().findElement(By.tagName("h1"));

        Assert.assertEquals(peopleTitle.getText(), "Build History of Jenkins");
    }
}
