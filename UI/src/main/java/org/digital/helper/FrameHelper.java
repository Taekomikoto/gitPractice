package org.digital.helper;

import org.digital.driver.Driver;
import org.openqa.selenium.WebDriver;

import java.awt.*;

public class FrameHelper {

    Frame frame;
    public FrameHelper switchToFrameWithId(String idOfIframe){
        WebDriver driver = Driver.getDriver();

        driver.switchTo().frame(idOfIframe);
        return this;

    }
    public FrameHelper switchToFrameWithIndex(int indexOfIframe){
        WebDriver driver = Driver.getDriver();

        driver.switchTo().frame(indexOfIframe);
        return this;

    }
    public FrameHelper switchToDefaultContent() {
        WebDriver driver = Driver.getDriver();

        driver.switchTo().defaultContent();

        return this;

}

}
