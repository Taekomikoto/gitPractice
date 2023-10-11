package org.digital.driver;

import org.digital.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
    private Driver(){
        // Single pattern
    }

    public static WebDriver driver;
    public static  WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    throw  new IllegalArgumentException("zYou provided wrong driver name");
            }
        }
        return driver;
    }
    public static void closeDrive(){
        try {
            if (driver!= null){
                driver.close();
                driver.quit();
                driver= null;
            }
        }catch (Exception e){
            System.out.println("Error while closing the driver");
}
}
}
