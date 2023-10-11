package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox extends BaseTest{

    @Test
    void fillUpTheFormTest(){
//        WebDriverManager.chromedriver().setup(); // setup chrome driver
//        WebDriver driver = new ChromeDriver(); // create new object
//        driver.manage().window().maximize(); // make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //setup  time

        driver.get("https://demoqa.com/text-box");


        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        String expectedUserName = "Monika Bellucci";
        fullNameInputField.sendKeys(expectedUserName);
//        fullNameInputField.sendKeys("Monika Bellucci");


        WebElement emailField = driver.findElement(By.id("userEmail"));
        String expectedUserEmail = "bellucci@icloud.com";
        emailField.sendKeys(expectedUserEmail);
//        emailField.sendKeys("bellucci@icloud.com");


        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String expectedCurrentAdd = "Mikhailovka";
        currentAddress.sendKeys(expectedCurrentAdd);
//        currentAddress.sendKeys("Mikhailovka");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String expectedPermanentAdd = "New York";
        permanentAddress.sendKeys(expectedPermanentAdd);
//        permanentAddress.sendKeys("New York");


        WebElement submitBtn = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();

//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driverChrome;
//        jsExecutor.executeScript("document.body.style.zoom='50%'");
//        I on zarabotaet


        WebElement resultName = driver.findElement(By.xpath("//p[@id='name']"));
        Assert.assertTrue(resultName.getText().contains(expectedUserName));


        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedUserEmail));


        WebElement resultCurrentAdd = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdd.getText().contains(expectedCurrentAdd));

//
        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAdd));

//        driver.close();
//        driver.quit();

    }

}
