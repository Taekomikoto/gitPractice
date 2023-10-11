package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest{

    @Test
    void demo123(){
        driver.get("");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        //make dbl click
        actions.doubleClick(doubleClickBtn).perform();
        WebElement dblClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(dblClickText.getText(), "You have done a double click");


        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
//        WebElement

    }

}
