package framework.pageobjects;

import framework.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (id = "email_create")
    private WebElement registrationEmailInput;

    @FindBy (id = "email")
    private WebElement loginEmailInput;

    @FindBy (id = "passwd")
    private WebElement loginPasswordInput;

    @FindBy (id = "SubmitCreate")
    private WebElement submitCreateButton;

    @FindBy (id = "SubmitLogin")
    private WebElement submitLoginButton;

    @FindBy (id = "//a[@title=\"Recover your forgotten password\"]")
    private WebElement recoverPasswordLink;

    @FindBy (id = "create_account_error")
    private WebElement createAccountError;

    @FindBy (className = "alert-danger")
    private WebElement errorMessage;

    public void createAccount() {

    }

    public void logIn() {
        loginEmailInput.sendKeys();
        loginPasswordInput.sendKeys();
        submitLoginButton.sendKeys(Keys.ENTER);
    }
}
