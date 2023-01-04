@smoke
Feature: Login positive and negative


Scenario Outline: user should be able to log in:
  Given user is on login page
  When user enter "<user>"
  Then user should be on home page
  And user logOut

  Examples:
  |user|
  |user183|
  |user184|
  |storemanager216|
  |storemanager217|
  |salesmanager279|
  |salesmanager280|


  Scenario: user should not be able to login with wrong email
    Given user is on login page
    When user enter "bob59@cybertekschool.com"
    Then error message shows


