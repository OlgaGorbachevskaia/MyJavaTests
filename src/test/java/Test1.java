import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void TestS() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("selenium");
        textBox.sendKeys(Keys.RETURN);
//        WebElement button = driver.findElement(By.name("btnK"));
//        button.click();
        Thread.sleep(2000);

        WebElement link = driver.findElement(By.xpath("//h3[text()='Selenium']"));
        driver.quit();
    }
}
