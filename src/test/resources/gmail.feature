
@run
Feature: Gmail Automation


  Scenario: Take the Screenshot of all the Pages In gmail.
    Given Chrome Browser launch
    When  I am on the Gmail Login and Enter the UserId and Password
    Then  I am able to Login Gmail

