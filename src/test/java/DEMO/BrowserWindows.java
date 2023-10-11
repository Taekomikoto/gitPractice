package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class BrowserWindows extends BaseTest{

    @Test
    public void windowTest() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();
        Thread.sleep(1000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().window(tabs.get(1));
//        driver.close();
//        Thread.sleep(3000);
        WebElement sample = driver.findElement(By.id("sampleHeading"));
        Thread.sleep(1000);
        Assert.assertEquals(sample.getText(), "This is sample page");
        Thread.sleep(3000);
    }

}
