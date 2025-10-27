Feature: HomePage

  Scenario: Verify Home page title is displayed
    Given User launches Chrome browser
    When User opens Home page
    Then User verifies Home page title is displayed
    And User quites browser