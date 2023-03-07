Feature:  As a user, I should be able to manage what to show in the Files page with the settings.

  Background: User is already logged in
    Given user on the dashboard page



  Scenario: Verify users can search any files/folder/users from the search icon
    When the user clicks the search icon
    And User types files/folders/users in the search box
    Then the user should be able to search files/folders/users