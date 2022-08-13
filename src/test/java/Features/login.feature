Feature: Application Login Module
  Scenario: Home page default login page
    Given User is on a landing home page
    When User clicks on the login option and enters the valid username "abc" and password "xyz"
    Then User gets logged in