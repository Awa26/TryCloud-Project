@Photos
Feature: Photos module is accessible to the user
  User story: As a user, I wan to access to Photos module.

  Background: User is already logged in


    Scenario: User should be able to access to the Photos module
      Given user on the dashboard page
      When user click the Photos button
      Then user should see Photos in the title
      Then user should be able to see all side menu selections