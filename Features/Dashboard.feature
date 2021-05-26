Feature: Navigate on application Dashboard
  
  @Dashboard
  Scenario: Verify Content available on Dashboard page
    Given Login to application
    When Verify page title
    Then User should able to filter/Task List/Notification list on dashboard
