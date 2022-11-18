package PageObject;

import Definition.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.time.Duration;

public class GuideSectionRenderer1 {
    WebDriver driver;


    public GuideSectionRenderer1(WebDriver driver) {
        this.driver = driver;
    }

    //Finding elements
    @FindBy(how = How.XPATH, using = "//ytd-guide-section-renderer[1]//div[1]//ytd-guide-entry-renderer[2]//a[1]//tp-yt-paper-item[1]")
    WebElement reels;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Next video']//yt-touch-feedback-shape//div[@aria-hidden='true']")
    WebElement reelDown;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Previous video']//yt-touch-feedback-shape//div[@aria-hidden='true']")
    WebElement reelUp;
    @FindBy(how = How.XPATH, using = "//a[@title='Subscriptions']//tp-yt-paper-item[@role='tab']")
    WebElement subscription;
    @FindBy(how = How.XPATH, using = "//input[@id='search']")
    WebElement searchBox;
    @FindBy(how = How.XPATH, using = "//button[@id='search-icon-legacy']")
    WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//ytd-topbar-logo-renderer[@id='logo']//div//yt-icon[@id='logo-icon']")
    WebElement home;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Search with your voice']//yt-touch-feedback-shape//div[@aria-hidden='true']")
    WebElement voiceSearch;
    @FindBy(how = How.XPATH, using = "//tp-yt-paper-dialog[@role='dialog']")
    WebElement VoicePopUp;
    @FindBy(how = How.XPATH, using = "//div[@id='microphone-container']")
    WebElement speak;
//@FindBy(how = How.XPATH, using = "")
//    WebElement;


    //Methods
    public void homepage() {
        home.click();
    }

    public void getTitle(String s) {

        String actual = driver.getTitle();
        Assert.assertEquals(actual, s);
        System.out.println("Title matched");
    }

    public void reel() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        reels.click();
    }

    public void clickReelDown() throws InterruptedException {

        int c = 2;
        for (int k = 0; k < c; k++) {

            reelDown.click();
            Thread.sleep(4000);
        }
        Thread.sleep(4000);
    }

    public void clickReelUp() {
        reelUp.click();
    }

    //sub
    public void clickOnSubscription() {
        subscription.click();
    }

    //searchbutton
    public void clickOnSearchField(String s) {
        searchBox.sendKeys(s);

    }

    public void clickOnSearchButton() {
        searchButton.click();

    }

    //voice search
    public void setVoiceSearch() {
        voiceSearch.click();
    }

    //to check voice pop is visible
    public void VoicePopUpVisibility() {
        VoicePopUp.isDisplayed();
    }

}
