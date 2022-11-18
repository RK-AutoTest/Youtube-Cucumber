package Definition;

import PageObject.GuideSectionRenderer1;
import WebdriverManager.WebDriverManagerSingleton;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Def {

    WebDriverManagerSingleton ws = WebDriverManagerSingleton.getInstance();
    WebDriver driver = ws.getDriver();

    GuideSectionRenderer1 gr = PageFactory.initElements(driver, GuideSectionRenderer1.class);


    //reels
    @When("user visits home page, page title should match expected title {string}.")
    public void user_visits_home_page_page_title_should_match_expected_title(String s) {
        gr.getTitle(s);
    }

    @When("user clicks on shorts.")
    public void user_clicks_on_shorts() {
        gr.reel();
    }

    @When("user clicks on down button two time to see next reels.")
    public void user_clicks_on_down_button_two_time_to_see_next_reels() throws InterruptedException {
        gr.clickReelDown();
    }

    @When("user clicks on up button one time to see previous reel.")
    public void user_clicks_on_up_button_one_time_to_see_previous_reel() {
        gr.clickReelUp();
    }

    //subs
    @When("user clicks on subscription button, it should take user to subscription page.")
    public void user_clicks_on_subscription_button_it_should_take_user_to_subscription_page() {
        gr.clickOnSubscription();
    }

    //search button
    @When("user clicks on search field and type desired search item {string}.")
    public void user_clicks_on_search_field_and_type_desired_search_item(String s) {
        gr.clickOnSearchField(s);
    }

    @When("click on search button.")
    public void click_on_search_button() {
        gr.clickOnSearchButton();
    }

    @Then("user should get navigated to search result page.")
    public void user_should_get_navigated_to_search_result_page() throws InterruptedException {
        Thread.sleep(3000);
        gr.homepage();
    }

    // voice search
    @When("user clicks on search with voice button")
    public void user_clicks_on_search_with_voice_button() {
        gr.setVoiceSearch();
    }

    @Then("microphone container should get popped up and visible to user.")
    public void microphone_container_should_get_popped_up_and_visible_to_user() {
        gr.VoicePopUpVisibility();
    }

    @Then("user should be able to use microphone to input data in search field.")
    public void user_should_be_able_to_use_microphone_to_input_data_in_search_field() throws InterruptedException {
        Thread.sleep(4000);
        ws.teardown();

    }
}
