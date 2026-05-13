package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class DashboardPage {

    WebDriver driver;

    WaitUtils waitUtils;

    public DashboardPage(WebDriver driver) {

        this.driver = driver;

        waitUtils = new WaitUtils(driver);
    }

    // Loading spinner
    private By loadingSpinner = By.className("animate-spin");

    // Dashboard locators
    private By dashboardOverview = By.xpath("//*[contains(text(),'financial overview')]");

    private By totalBalanceCard = By.xpath("//*[contains(text(),'Total Balance')]");

    // Verify dashboard loaded
    public boolean isDashboardDisplayed() {

        // Wait until spinner disappears
        waitUtils.waitForInvisibility(loadingSpinner);

        // Wait until dashboard text appears
        return waitUtils
                .waitForVisibility(dashboardOverview)
                .isDisplayed();
    }

    // Verify balance card visible
    public boolean isTotalBalanceVisible() {

        return waitUtils
                .waitForVisibility(totalBalanceCard)
                .isDisplayed();
    }
}