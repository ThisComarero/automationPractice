package framework.pageobjects;

import framework.BasePage;
import framework.config.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    final private static MainPage instance = new MainPage();

    public static MainPage getInstance() {return  instance;}

    @FindBy(className = "header_user_info")
    private WebElement signInButton;

    @FindBy(className = "contact-link")
    private WebElement contactButton;

    @FindBy(className = "shopping_cart")
    private WebElement shoppingCartButton;

    @FindBy(className = "button-search")
    private WebElement searchButton;

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(className = "img-responsive")
    private WebElement mainLogo;

    @FindBy(xpath = "//button[@name=\"submitNewsletter\"]")
    private WebElement submitNewsleterButton;

    public MainPage() {
        Browser.openPage(this);
    }

    public void openCart() {
        shoppingCartButton.sendKeys(Keys.ENTER);
    }

    public void search(String seatchValue) {
        searchField.sendKeys(seatchValue);
        searchButton.sendKeys(Keys.ENTER);
    }

    public void clickSignInButton() {
        signInButton.sendKeys(Keys.ENTER);
    }
}
