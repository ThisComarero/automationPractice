package framework;

import com.github.javafaker.Faker;
import framework.config.Browser;
import framework.config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.LoadableComponent;

import java.util.List;

public class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T> {

    public static WebDriver getDriver() { return Config.getInstance().getDriver(); }

    Actions actions = new Actions(Browser.getDriver());

    public void javascriptClick(WebElement element){
        ((JavascriptExecutor) Browser.getDriver()).executeScript("arguments[0].scrollIntoView(true);arguments[0].click();", element);
    }

    public void clickCheckbox(WebElement checkbox, Boolean value) {
        if (checkbox.isSelected()) {
           if (value) {
               javascriptClick(checkbox);
           }
        } else {
            if (value) {
                javascriptClick(checkbox);
            }
        }
    }

    public void clickSelect(WebElement selectElement, String select) {
        scrollToElement(selectElement);
        javascriptClick(selectElement);
        List<WebElement> selectElements = Browser.getDriver().findElements(By.className("option"));
        try {
            for (WebElement e : selectElements) {
                if (e.getText().equals(select)) {
                    scrollToElement(e);
                    actions.click(e).build().perform();
                }
            }
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
        }
    }

    public void unClick() { actions.click().perform();}

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Browser.getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void sendDataToField(WebElement webElement, String fieldData) {
        if(fieldData != null && webElement.isEnabled()) {
            webElement.clear();
            webElement.sendKeys(fieldData);
        }
    }

    public void sendDataToSelect(WebElement webElement, String fieldData) {
        scrollToElement(webElement);
        if (fieldData != null) {
            clickSelect(webElement, fieldData);
        }
        unClick();
    }

    Faker faker = new Faker();

    protected void load() {

    }

    protected void isLoaded() throws Error {

    }
}
