import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class newTest {
@Test
    public void newTest (){

    //System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");

    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    String title = driver.getTitle();
    assertEquals("Web form", title);


    WebElement textBox = driver.findElement(By.name("my-text"));
    WebElement submitButton = driver.findElement(By.cssSelector("button"));

    textBox.sendKeys("Selenium");
    submitButton.click();

    WebElement message = driver.findElement(By.id("message"));
    String value = message.getText();
    assertEquals("Received!", value);

    driver.quit();
}
}
