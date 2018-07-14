Feature: Login
  This test is for the login page

  Background:
    Given I navigate to the dev.giftrt.com
    When I click on login

    @valid  @smoke
  Scenario: valid login
    And I entered the username
    And I entered the password
    And i click on the login button
    Then I should be logged in

  @invalid
  Scenario: login with invalid username
    And I entered invalid user name
    And I enter my password
    And I click on the login button
    Then I am not logged in

  @invalid
  Scenario: login with invalid password
    And I entered invalid username
    And I enter invalid password
    And I click on the login button
    Then I am not logged in



  @valid
  Scenario: Valid Login
    And I entered my username as "Deji"
    And I enter my password as "Dejipassword"
    And I click on the login button
    Then I am logged in

  @valid
  Scenario Outline: valid login with multiple user
    And I entered my user name as "<username>"
    And I enter my password as "<password>"
    And I click on the login button
    Then I am logged in
    And I log out


    Examples:
      |username|password|
      |dejiuser|dejipassword|
      |dejiuser2|dejiuser2password|