@wip
Feature: Logout feature
  User Story :
  As a user, I should be able to log out.

  Users: PosManager and SalesManager

  Background:
    Given User is on the upgenix home page


  Scenario: Verify that User can log out and ends up in login page.
    Given User should be able click log out button and ends up in login page
    Then User should see the title is "Login | Best solution for startups"


  Scenario:Verify that User can not go to the home page again by clicking the step back button after successfully logged out.
    Given User should be able click log out button and ends up in login page
    And User should be able to not go to the home page again by clicking the step back button
    Then User should see the alert is "Odoo Session Expired"







