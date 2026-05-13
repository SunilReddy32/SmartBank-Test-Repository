package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    WebDriver driver;

    WebDriverWait wait;

    public WaitUtils(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(30));
    }

    // Wait for element visibility
    public WebElement waitForVisibility(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be clickable
    public WebElement waitForClickable(By locator) {

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for element to disappear
    public boolean waitForInvisibility(By locator) {

        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait for URL to contain text
    public boolean waitForUrlContains(String urlPart) {

        return wait.until(
                ExpectedConditions.urlContains(urlPart));
    }

    // Wait for title to contain text
    public boolean waitForTitleContains(String titlePart) {

        return wait.until(
                ExpectedConditions.titleContains(titlePart));
    }
}