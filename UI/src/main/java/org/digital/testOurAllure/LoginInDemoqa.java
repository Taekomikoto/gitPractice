package org.digital.testOurAllure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInDemoqa {


    private WebDriver driver;
    private By usernameField = By.id("userName");
    private By passwordField = By.id("password");
    private By loginButton = By.id("newUser");

    public LoginInDemoqa(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

}
