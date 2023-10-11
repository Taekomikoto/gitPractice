package DEMO;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class NavigationAndDropdowns{

    WebDriver driver;

    @BeforeClass
    public void setupBrowser(){
        WebDriverManager.chromedriver().setup(); // setup chrome driver
        driver = new ChromeDriver(); // create new object
        driver.manage().window().maximize(); // make full screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //setup  time
    }

//    @Test
//    void Demo1(){
//        driver.navigate().to("https://nambafood.kg/");
//        driver.findElement(By.xpath("(//a[href='/food'])[1]")).click();
////        Thread.sleep(5000);
////        driver.navigate().back();
////        driver.navigate().forward();
////        driver.navigate().refresh();
//    }

//    @Test
//    void demo2(){
//        driver.get("https://demoqa.com/select-menu");
//        WebElement selectorColor = driver.findElement(By.id("oldSelectMenu"));
//
//
//        Select select = new Select(selectorColor);
//        select.selectByVisibleText("Green");
////        select.selectByValue("4");
////        select.selectByIndex(7);
////        select.selectByIndex(7);
//
//
//        List<WebElement> selectedOption = select.getOptions();
//        for(WebElement option: selectedOption){
//            System.out.println(option.getText());
//        }
//
//    }

//    public static void selectRandomColor(){
//        Random randomColor = new Random();
//        randomColor.
//    }

    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor= driver.findElement(By.id("oldSelectMenu"));
        Select select= new Select(selectColor);
//        select.selectByVisibleText("Green");
//
//        Thread.sleep(3000);
//        select.selectByValue("3");
//
//        select.selectByIndex(7);
//       // select.deselectByIndex(7);


        List<WebElement> selectedOption= select.getOptions();
//        for(WebElement option: selectedOption){
//            System.out.println(option.getText());
//        }
        selectRandomColor(select, selectedOption);

    }
    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOption) throws InterruptedException {

        Random randomColor= new Random();
        int indexColor= randomColor.nextInt(selectedOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(7000);
    }

}
