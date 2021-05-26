Feature: Login to application
  
  @Login
  Scenario: Login with valid credentials
    Given Launch Chrome Browser
    When Enter UserName and Password
    And Click on submit button
    Then User should navigate to dashboard