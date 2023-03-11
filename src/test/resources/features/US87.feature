

Feature: As a user, I should be able to access to Files module - Favorites
  button

  Background:
    When user is already logged in.
    #Given user on the dashboard page



  Scenario: Verify users to add files to Favorites
    ## Given user on the home page
    When the user clicks the File module
    When the user clicks action-icon from any file on the page
    And user choose the Add to favorite option
    And user click the Favorite sub-module on the left side
    Then Verify the chosen file is listed on the table