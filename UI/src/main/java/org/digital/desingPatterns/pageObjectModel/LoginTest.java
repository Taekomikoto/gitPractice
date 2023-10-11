package org.digital.desingPatterns.pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;

//        @BeforeClass
//        public void ppp(){
////            System.setProperty("webdriver.chrome.driver", "C:\\Users\\taeko\\Desktop\\projectHTML\\SummerSDET2023\\UI\\src\\main\\resources\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
////            WebDriver driver = new ChromeDriver();
//
////            driver.manage().window().maximize();
//            //        driver.quit();
//        }


    @Test
    public void ttt(){
        this.driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        LoginPage1 loginPage = new LoginPage1(driver);


        loginPage.enterUsername("John Doe");
        loginPage.enterPassword("asd123");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement targetElement = driver.findElement(By.id("newUser"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", targetElement);
        loginPage.clickLoginButton();
    }

//    public static void main(String[] args) {
//        LoginTest loginTest = new LoginTest();
//        LoginTest
//    }


}