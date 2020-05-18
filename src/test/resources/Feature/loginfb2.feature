Feature: Facebook loginfeature test

  Scenario: User verify login with valid credential
    Given user launch browser
    And user enter fb url
    When user enter username and password credential
      | name  | pwd       | email           |
      | sekar | pass6868  | sekar@gmail.com |
      | kavya | pass3248  | kavya@gmail.com |
      | jyo   | pass90968 | jyo@gmail.com   |
    And user click login button
    Then user verify test
