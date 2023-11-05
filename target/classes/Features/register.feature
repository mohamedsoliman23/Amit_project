Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user enter email "d@example.com" field
    Then click on create account
    When user select gender type
    And user enter first name "automation" and last name "tester"
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And user enter date of birth
    And enter rest fields
    Then user clicks on register button
    And Assert Register Successfully