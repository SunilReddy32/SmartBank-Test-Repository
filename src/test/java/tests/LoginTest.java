package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        AdminPage adminPage = new AdminPage(driver);

        Assert.assertTrue(
                adminPage.isAdminPanelDisplayed());

        Assert.assertTrue(
                adminPage.isUsersTabVisible());

        Assert.assertTrue(
                adminPage.isAccountsTabVisible());

        System.out.println("Admin Login Successful");
    }
}