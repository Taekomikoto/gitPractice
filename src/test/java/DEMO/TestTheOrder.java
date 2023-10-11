package DEMO;

import DEMO.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


import javax.swing.*;
import java.time.Duration;

public class TestTheOrder extends BaseTest{

//    WebDriver driver;

//    @BeforeClass
//    void orderingFood11() {
//
////        Actions actions = new Actions(driver);
//
//
//        WebDriverManager.chromedriver().setup(); // setup chrome driver
//        WebDriver driver = new ChromeDriver(); // create new object
//        driver.manage().window().maximize(); // make full screen
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //setup  time
//
//        driver.get("https://nambafood.kg/");



//


//        WebElement emailField = driver.findElement(By.id("userEmail"));
//        String expectedUserEmail = "bellucci@icloud.com";
//        emailField.sendKeys(expectedUserEmail);
////        emailField.sendKeys("bellucci@icloud.com");
//
//
//        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
//        String expectedCurrentAdd = "Mikhailovka";
//        currentAddress.sendKeys(expectedCurrentAdd);
////        currentAddress.sendKeys("Mikhailovka");
//
//
//        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//        String expectedPermanentAdd = "New York";
//        permanentAddress.sendKeys(expectedPermanentAdd);
////        permanentAddress.sendKeys("New York");
//
//
//        WebElement submitBtn = driver.findElement(By.id("submit"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
//        submitBtn.click();

        //-----------------------------------------------------

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
////        driver.get("https://nambafood.kg/");
//        js.executeScript("window.location='https://nambafood.kg/'");
//
//        WebElement BtnOfFood = driver.findElement(By.xpath("//a[@href=’/food’]"));
//        js.executeScript("arguments[0].click()", BtnOfFood);
////        System.out.println(BtnOfFood.getText());
////        BtnOfFood.click();

//    }

    @Test
    void test11(){
        driver.get("https://nambafood.kg/");
        WebElement foodBtnClick = driver.findElement(By.xpath("//a[@href='/food']"));
        foodBtnClick.click();
    }

//    @AfterClass
//    void orderingFood22(){
//
//    }


}
