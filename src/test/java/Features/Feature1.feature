Feature: User should be able to use guide section renderer on top left span.

  @reels
  Scenario: user should be able to visit home page of youtube.com and check out reels.
    When user visits home page, page title should match expected title 'YouTube'.
    And user clicks on shorts.
    And user clicks on down button two time to see next reels.
    And user clicks on up button one time to see previous reel.

  @subs
  Scenario: user clicks on subscription.
    When user clicks on subscription button, it should take user to subscription page.

  @searchButton
  Scenario: user should be able to use search texts by entering input in input text field and click on search button.
    When user clicks on search field and type desired search item 'Beaches'.
    And click on search button.
    Then user should get navigated to search result page.

  @voiceSearch
  Scenario: user should be able to use search with voice.
    When user clicks on search with voice button
    Then microphone container should get popped up and visible to user.
    Then user should be able to use microphone to input data in search field.



