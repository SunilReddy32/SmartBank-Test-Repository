package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators

    private By emailField = By.cssSelector("input[type='email']");

    private By passwordField = By.cssSelector("input[type='password']");

    private By loginButton = By.cssSelector("button[type='submit']");

    // Actions

    public void enterEmail(String email) {

        driver.findElement(emailField)
                .sendKeys(email);
    }

    public void enterPassword(String password) {

        driver.findElement(passwordField)
                .sendKeys(password);
    }

    public void clickLogin() {

        driver.findElement(loginButton)
                .click();
    }

    public void login(String email, String password) {

        enterEmail(email);

        enterPassword(password);

        clickLogin();
    }
}