Feature: login

  Scenario: Login to Cafe Townsend
    Given I am on the homepage
    When I enter my credentials
    Then I am logged in