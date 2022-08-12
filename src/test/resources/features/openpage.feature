Feature:  Interact with the toolsqa page

  @Test
  Scenario: As new user, I would like to open the browser
    and go to the toolsqa page
    Given I open the browser and go to the toolsqa page
    When I close the alert in the page
    Then I see that it is the correct page