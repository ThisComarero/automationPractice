package framework.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class Config {

    private static final Config instance = new Config();

    private Properties properties;
    private WebDriver driver;

    private Config() {
        properties = new Properties();
        try{
            InputStream stream = Config.class.getResourceAsStream("/app.properties");
            properties.load(stream);
            stream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        WebDriverManager.getInstance(CHROME).arch32().setup();
        System.setProperty("Webdriver, chrome.driver", "C:/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public String getUrl(){
        System.out.println(properties.getProperty("url"));
        return properties.getProperty("url");
    }

    private String getChromeDriver() {return properties.getProperty("chromedriver");}

    //To do screenshot patch

    public WebDriver getDriver() {return driver;}

    public static Config getInstance(){return instance;}
}
