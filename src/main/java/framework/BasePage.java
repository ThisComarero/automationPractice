package framework;

import framework.config.Browser;
import framework.config.Config;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

public class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T> {

    public static WebDriver getDriver() { return Config.getInstance().getDriver(); }

    public void javascriptClick(WebElement element){
        ((JavascriptExecutor) Browser.getDriver()).executeScript("arguments[0].scrollIntoView(true);arguments[0].click();", element);
    }
    protected void load() {

    }

    protected void isLoaded() throws Error {

    }
}
