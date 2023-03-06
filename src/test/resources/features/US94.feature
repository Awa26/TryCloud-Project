
Feature:  As a user, I should be able to update settings

  Background: User is already logged in
    Given user on the dashboard page



  Scenario: Verify the users can check any checkbox on the Files page
    When the user clicks the Files module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any checkbox