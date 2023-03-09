Feature:  As a user, I should be able to search any item/ users from the search icon

  Background: User is already logged in
    Given user on the dashboard page




 @wip1
 Scenario: Verify users can search any files/folder/users from the search icon
    When the user clicks the search icon
    And User types "books" in the search box
    Then the user should be able to see "books" in search result