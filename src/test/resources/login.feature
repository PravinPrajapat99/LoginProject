#author - pravin
@feature
Feature: feature to test login function

  Scenario Outline: Check login is successful with correct pass

    Given user is on login
    When user enter "<id>" "<pass>"
    And click login button
    Then  user is navigeted to login page
    Examples:
      | id        | pass        |
      | mystudent | 123         |
      | student   | Password123 |



