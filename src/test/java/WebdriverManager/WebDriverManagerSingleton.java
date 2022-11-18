package WebdriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WebDriverManagerSingleton {
    // to create instance of singleton class.
    private static WebDriverManagerSingleton wdm = null;
    private static WebDriver driver;

    private WebDriverManagerSingleton() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
    }

    //to create instance of class
    public static WebDriverManagerSingleton getInstance() {
        if (wdm == null) {
            wdm = new WebDriverManagerSingleton();
        }
        return wdm;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.get("https://www.youtube.com/");

        }
        return driver;
    }


    public void teardown() {
        driver.quit();

    }

}
