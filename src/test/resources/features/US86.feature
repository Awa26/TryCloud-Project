@ac
Feature: As a user, I should be able to access to Files module.

  Background:
    When user is already logged in.
    Given user on the dashboard page


  Scenario: verify users can access to Files module
    When the user clicks the "Files" module
    Then verify the page title is "Files - Seamlessly."
