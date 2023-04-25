package V16_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HWAndrey1 {

    // 1 	Проверяем наличие кнопки «Посмотреть корзину» - вопрос про него
    @Test
          public void test1() {
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium1py.pythonanywhere.com/ru/");

    WebElement prosmotrkorzina = driver.findElement(By.xpath("//*[@class=\"btn-group\"]"));
    prosmotrkorzina.click();

    driver.quit();
}

    //    Задание 2 - Проверяем наличие поля для поиска и кнопки «Найти»
    @Test
           public void test2(){
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium1py.pythonanywhere.com/ru/");

    WebElement polefind = driver.findElement(By.xpath("//input[@type = 'search']"));

    WebElement find = driver.findElement(By.xpath("//input[@type = 'submit']"));
    find.click();

    driver.quit();
}

// 3. Незарегистрированный пользователь может искать товары на сайте
    @Test(dependsOnMethods = "test2")
           public void test3() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium1py.pythonanywhere.com/ru/");

    WebElement polefind = driver.findElement(By.xpath("//input[@type = 'search']"));
    polefind.sendKeys("«The shellcoder's handbook»");
    Thread.sleep(3000);

    WebElement find = driver.findElement(By.xpath("//input[@type = 'submit']"));
    find.click();
    Thread.sleep(6000);

    driver.quit();
    }

    // 4 Незарегистрированный пользователь может добавлять товары в корзину
    @Test(dependsOnMethods = "test2")
    public void test4() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("http://selenium1py.pythonanywhere.com/ru/");

    WebElement polefind = driver.findElement(By.xpath("//input[@type = 'search']"));
    polefind.sendKeys("«The shellcoder's handbook»");
    Thread.sleep(3000);

    WebElement find = driver.findElement(By.xpath("//input[@type = 'submit']"));
    find.click();
    Thread.sleep(3000);

    WebElement dobavit = driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-block']"));
    dobavit.click();
    Thread.sleep(6000);

    // надо ли это тут?
    WebElement prosmotrkorzina = driver.findElement(By.xpath("//*[@class=\"btn-group\"]"));
    prosmotrkorzina.click();
    Thread.sleep(6000);

    driver.quit();
    }

    // 5. Незарегистрированный пользователь может изменять количество товаров в корзине

    @Test(dependsOnMethods = "test2")
    public void test5() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://selenium1py.pythonanywhere.com/ru/");

        WebElement polefind = driver.findElement(By.xpath("//input[@type = 'search']"));
        polefind.sendKeys("«The shellcoder's handbook»");
        Thread.sleep(3000);

        WebElement find = driver.findElement(By.xpath("//input[@type = 'submit']"));
        find.click();
        Thread.sleep(3000);

        WebElement dobavit = driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-block']"));
        dobavit.click();
        Thread.sleep(2000);

        WebElement prosmotrkorzina = driver.findElement(By.xpath("//*[@class=\"btn-group\"]"));
        prosmotrkorzina.click();
        Thread.sleep(6000);

        WebElement kolichestvo = driver.findElement(By.xpath("//input[@type = 'number']"));
        kolichestvo.clear();
        kolichestvo.sendKeys("10");
        Thread.sleep(3000);
        WebElement obnovit = driver.findElement(By.xpath("//button[@data-loading-text = 'Обновление...']"));
        obnovit.click();
        Thread.sleep(6000);

        driver.quit();
    }
}

