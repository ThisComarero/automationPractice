package framework.pageobjects;

import framework.BasePage;
import framework.config.Browser;
import framework.model.entity.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    final private static RegistrationPage instance = new RegistrationPage();

    public static RegistrationPage getInstance() {return  instance;}
    @FindBy(id = "id_gender")
    private WebElement maleRadioButton;

    @FindBy(id = "id_gender2")
    private WebElement femaleRadioButton;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "days")
    private WebElement birthDay;

    @FindBy(id = "months")
    private WebElement birthMonth;

    @FindBy(id = "years")
    private WebElement birthYear;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    private WebElement recievieOffersCheckbox;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement firstAdressPart;

    @FindBy(id = "address2")
    private WebElement secondAdressPart;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "other")
    private WebElement additionalInfo;

    @FindBy(id = "phone")
    private WebElement phone;

    @FindBy(id = "phone_mobile")
    private WebElement mobile;

    @FindBy(id = "alias")
    private WebElement addressAlias;

    @FindBy(id = "submitAccount")
    private WebElement submitButton;

    public RegistrationPage() {
        Browser.openPage(this);
    }

    public void fillForm(User user){
        clickCheckbox(maleRadioButton, true);
        sendDataToField(customerFirstName, user.getCustomerFirstName());
        sendDataToField(customerLastName, user.getCustomerLastName());
        sendDataToField(company, user.getCompany());
        sendDataToField(firstAdressPart,user.getFirstAddressPart());
        sendDataToField(secondAdressPart,user.getSecondAddressPart());
        sendDataToField(city,user.getCity());
        sendDataToSelect(state,user.getEState().toString());
        submitButton.click();
    }
}
