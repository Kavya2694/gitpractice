Feature: Facebook loginfeature test

  Scenario: User verify login with valid credential
    Given user launch browser
    And user enter fb url
    When user enter username and password credential
      | username1 | vel@gmail.com   |
      | username2 | kavya@gmail.com |
      | username3 | jyo@gmail.com   |
      | password1 | pass6868        |
      | password2 | pass3248        |
      | password3 | pass90968       |
    And user click login button
    Then user verify test
