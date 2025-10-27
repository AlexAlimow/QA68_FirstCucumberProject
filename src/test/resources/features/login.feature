Feature: Login

  @positive

  Scenario: Login with correct data
    Given User launches Chrome browser
    When User opens Home page
    And User clicks on Log in link
    And User enters correct data
    And User clicks on Yalla button
    Then User verifies Success message text
    And User quites browser

  @wrongPassword
  Scenario Outline: Login with correct email and wrong password
    Given User launches Chrome browser
    When User opens Home page
    And User clicks on Log in link
    And User enters correct email and wrong password
      | email   | password   |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error message text
    And User quites browser
    Examples:
      | email                   | password     |
      | gorlum007user@gmail.com | tESTtEST==/1 |
      | gorlum007user@gmail.com | ЕуыеЕуые007! |
      | gorlum007user@gmail.com | testtest007! |
      | gorlum007user@gmail.com | TestTest007 |
