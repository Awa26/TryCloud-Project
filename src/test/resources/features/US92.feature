@IG
Feature: As a user, I should be able to delete a file/folder.

  Background: User is already logged in
        Given user on the dashboard page
When the user clicks the "Files" module

  Scenario: Verify users delete a file/folder

    And user click action-icon from any file on the page
    And user choose the "Delete file/folder" option
    When the user clicks the "Deleted file/folder" sub-module on the left side
    Then Verify the deleted file is displayed on the Deleted Files page.
