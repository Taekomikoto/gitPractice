package org.digital.testOurAllure;
import org.digital.desingPatterns.pageObjectModel.LoginPage1;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;

public class LoginDemoqaTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\taeko\\Desktop\\projectHTML\\SummerSDET2023\\UI\\src\\main\\resources\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        LoginInDemoqa loginPage = new LoginInDemoqa(driver);

        loginPage.enterUsername("John Doe");
        loginPage.enterPassword("asd123");
        loginPage.clickLoginButton();

//        driver.quit();
    }
}
