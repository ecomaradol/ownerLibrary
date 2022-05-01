package config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;


public class WebDriverProvider implements Supplier<WebDriver> {

    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }


    @Override
    public WebDriver get() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Zlata/Introduction/chromedriver.exe");
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.nonNull(config.getBrowser())) {
            switch (config.getBrowser()) {
                case CHROME: {
                    return new ChromeDriver();
                }
                case FIREFOX: {
                    return new FirefoxDriver();
                }
                default: {
                   throw new RuntimeException("Type of browser does not support");
                }
            }
        }
        throw new RuntimeException("Type of browser can`t be null");
    }
}
