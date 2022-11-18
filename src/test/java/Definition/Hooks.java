package Definition;


import WebdriverManager.WebDriverManagerSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriverManagerSingleton ws = WebDriverManagerSingleton.getInstance();
    WebDriver driver = ws.getDriver();


    public void teardown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
