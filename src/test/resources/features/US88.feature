Feature:  As a user, I should be able to upload a file.

  Background: User is already logged in
    Given user on the dashboard page

  @uploadFile
  Scenario: verify users to upload a file from Files
    When the user clicks the "Files" module
    When the user clicks the add icon on the top
    And users uploads file with the “upload file” option
    Then verify the file is displayed on the page