Feature: Login to Cafe Townsend portal

  Scenario: Successful login to portal
    Given I am on the homepage
    When I enter my credentials
    Then I am logged in

  Scenario: Wrong credentials while logging in to portal
    Given I am on the homepage
    When I enter the wrong credentials
    Then invalid credentials message is displayed