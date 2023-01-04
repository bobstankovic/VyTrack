@smoke
Feature: Login positive and negative


Scenario Outline: user should be able to log in:
  Given user is on login page
  When user enter "<user>"
  Then user should be on home page
  And user logOut

  Examples:
  |user|
  |user185|
  |user186|
  |storemanager219|
  |storemanager220|
  |salesmanager282|
  |salesmanager283|


  Scenario: user should not be able to login with wrong email
    Given user is on login page
    When user enter "bob59@cybertekschool.com"
    Then error message shows


