package framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Browser {
    public static WebDriver getDriver() {return Config.getInstance().getDriver();}

    public static <T> void openPage(T object) {
        PageFactory.initElements(new AjaxElementLocatorFactory(getDriver(), 6), object);
    }

    public static void open(String url) {getDriver().get(url);}

    public static void close() {getDriver().close();}

}
