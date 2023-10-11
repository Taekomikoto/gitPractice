package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class StartTreiler extends BaseTest{
    @Test
    void kino1() throws InterruptedException {
        driver.get("https://www.kinopoisk.ru/?utm_referrer=www.google.com");
        WebElement search = driver.findElement(By.xpath("//input[@name='kp_query']"));
        search.sendKeys("Maska");
        Thread.sleep(8000);
        WebElement mask = driver.findElement(By.xpath("//a[@href = '/film/6039/sr/2/']"));
        mask.click();
        Thread.sleep(5000);
        driver.get("https://www.kinopoisk.ru/film/6039/");

        WebElement startTrailer = driver.findElement(By.xpath("(//a[@href ='/film/6039/video/80592/'])[1]"));
        Actions actions = new Actions(driver);

        Thread.sleep(3000);




        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Выполняем скроллинг вниз на 500 пикселей
//        js.executeScript("window.scrollBy(startTrailer)");

        actions.click(startTrailer).perform();
        Thread.sleep(3000);
        WebElement btn = driver.findElement(By.xpath("//iframe[@href = 'https://widgets.kinopoisk.ru/discovery/film/6039/trailer/80592?noAd=0&embedId=&hidden=&muted=&loop=0&autoplay=1&from=&extraTrailers=&onlyPlayer=1']"));
        btn.click();


    }
}
