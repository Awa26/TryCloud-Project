@login
Feature: As a user, I should be able to log in.

  Scenario Outline: Verify login with valid credentials
    When user enters username "<username>" and passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |


