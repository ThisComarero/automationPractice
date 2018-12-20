package tests;

import dataprovider.UserDataProvider;
import framework.config.Browser;
import framework.model.entity.User;
import framework.pageobjects.LoginPage;
import framework.pageobjects.MainPage;
import framework.pageobjects.RegistrationPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import java.sql.Driver;

public class RegistrationTest {

    MainPage mp = new MainPage();
    RegistrationPage rp = new RegistrationPage();
    LoginPage lp = new LoginPage();

    @Test(priority = 1, description = "createAccount", dataProvider = "UserDataProvider", dataProviderClass = UserDataProvider.class)
    @Description("Create new account")
    public void createAccount(User appUser) {
        mp.clickSignInButton();
        lp.createAccount();
        rp.fillForm(appUser);
        Assert.assertTrue(Browser.getDriver().getTitle().equals("My account"));
    }
}
