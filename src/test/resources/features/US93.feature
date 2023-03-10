@fs
Feature: As a user, I should be able to write comments to files/folders.

Background: user is already logged in
  Given user on the dashboard page
  When the user clicks the "Files" module


  Scenario:Verify users to write comments to files/folder

    And user click action-icon from any file on the page
    And user choose the Details option
    And user write a comment inside the input box
    And user click the submit button to post it
    Then Verify the comment is displayed in the comment section.