Feature: F01_Registration / guest users could create new accounts
  Scenario: use could create new account with valid data
    Given user go to register page
    When user select gender type
    And user enter first name
    And user enter last name
    And user enter Email
    And user enter password and confirm password
    And user click on register button
    Then account is created successfully
    Scenario: user can login
    Given user go to login page
    When user enter loginEmail
    And user enter password
    And user select remember me
    And user click on login button

