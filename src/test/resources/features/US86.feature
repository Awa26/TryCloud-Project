@ac
Feature: As a user, I should be able to access to Files module.

  Background:
    When user is already logged in.
    Given user on the dashboard page
    When the user clicks the "Files" module


  Scenario: verify users can access to Files module
    Then verify the page title is "Files - Seamlessly."

  Scenario: verify users can select all the uploaded files from the page
    And user click the top-left checkbox of the table
    Then verify all the files are selected
