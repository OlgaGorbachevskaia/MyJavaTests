import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGr1 {
    @Test
    public void Test3(){
            String expectedErrorText = "Error: Please enter at least a message, your email address and the security code.";

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");

            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.99-bottles-of-beer.net/signv2.html");

            WebElement name = driver.findElement(By.name("name"));
            name.sendKeys("Tatiana");

            WebElement location = driver.findElement(By.xpath("//p/input[@name='location']"));
            location.sendKeys("Berlin");

            WebElement email= driver.findElement(By.xpath("//p/input[@name='email']"));
            email.sendKeys("tatiana@gmail.com");

            WebElement homepage = driver.findElement(By.xpath("//p/input[@name='homepage']"));
            homepage.sendKeys("www.babaduc.com");

            WebElement message = driver.findElement(By.xpath("//p/textarea[@name='comment']"));
            message.sendKeys("comment");

            WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
            submit.click();

            WebElement error = driver.findElement(By.xpath("//div[@id='main']/p[contains(text(),' Please enter')]"));
            String actualErrorText = error.getText();

            Assert.assertEquals(actualErrorText, expectedErrorText);

            driver.quit();
        }
}
