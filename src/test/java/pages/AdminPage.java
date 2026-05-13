package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class AdminPage {

    WebDriver driver;

    WaitUtils waitUtils;

    public AdminPage(WebDriver driver) {

        this.driver = driver;

        waitUtils = new WaitUtils(driver);
    }

    // Loading spinner
    private By loadingSpinner = By.className("animate-spin");

    // Admin panel heading
    private By adminPanelHeading = By.xpath("//*[contains(text(),'Admin Panel')]");

    // Users tab
    private By usersTab = By.xpath("//button[contains(text(),'Users')]");

    // Accounts tab
    private By accountsTab = By.xpath("//button[contains(text(),'Accounts')]");

    private By accountsTable = By.xpath("//table");

    private By accountNumberHeader = By.xpath("//*[contains(text(),'Account No.')]");

    // Methods

    public boolean isAdminPanelDisplayed() {

        waitUtils.waitForInvisibility(loadingSpinner);

        return waitUtils
                .waitForVisibility(adminPanelHeading)
                .isDisplayed();
    }

    public boolean isUsersTabVisible() {

        return waitUtils
                .waitForVisibility(usersTab)
                .isDisplayed();
    }

    public boolean isAccountsTabVisible() {

        return waitUtils
                .waitForVisibility(accountsTab)
                .isDisplayed();
    }

    // First role toggle button
    private By roleToggleButton = By.xpath("(//button[contains(text(),'Make')])[1]");

    private By updatedRoleButton = By.xpath("(//button[contains(text(),'Make')])[1]");

    public void clickRoleToggleButton() {

        waitUtils
                .waitForClickable(roleToggleButton)
                .click();
    }

    public String getRoleButtonText() {

        return waitUtils
                .waitForVisibility(updatedRoleButton)
                .getText();
    }

    public void clickAccountsTab() {

        waitUtils
                .waitForClickable(accountsTab)
                .click();
    }

    public boolean isAccountsTableVisible() {

        return waitUtils
                .waitForVisibility(accountsTable)
                .isDisplayed();
    }

    public boolean isAccountHeaderVisible() {

        return waitUtils
                .waitForVisibility(accountNumberHeader)
                .isDisplayed();
    }
}