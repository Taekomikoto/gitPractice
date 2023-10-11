package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setupBrowser(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver
//        WebDriverManager.edgedriver().setup(); // setup chrome driver
        driver = new ChromeDriver(); // create new object
//        driver = new EdgeDriver(); // create new object
        driver.manage().window().maximize(); // make full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //setup  time
    }

}
