Feature: Login feature

  User Story :
  As a user, I should be able to log in so that I can land on homepage.

  Users: PosManager and SalesManager

  Background:
    Given User is on the upgenix login page

  @BRT-346
  Scenario Outline: Positive login scenario
    When User enter valid "<Username>" and valid "<Password>"
    And  User click to login button
    Then User should see the title is "#Inbox - Odoo"

    Examples:

      | Username                | Password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |

  @BRT-347
  Scenario Outline: Negative login scenario
    When User enter "<Username>" and "<Password>"
    And  User click to login button
    Then User should see "Wrong login/password" displayed

    Examples:

      | Username                | Password     |
      | posmanager10@info.com   | pos          |
      | salesmanager10@info.com | manager      |
      | posmanager@info.com     | posmanager   |
      | salesmanager.info       | salesmanager |
      | posmanager&10           | 43*&         |
      | salesmanager10          | sales1       |

  @BRT-348
  Scenario Outline:Negative login scenario with empty username and valid password
    When User enter "<Password>" and "<Username>"
    And  User click to login button
    Then User should see "Please fill out this field." message displayed

    Examples:

      | Password     | Username       |
      | posmanager   |                |
      | salesmanager |                |
      |              | posmanager34   |
      |              | salesmanager45 |

  @BRT-349
  Scenario: User land on the 'reset password' page after clicking on the "Reset password" link
    When User click "Reset password" link
    Then User should see the title is "Reset password | Best solution for startups"

  @BRT-350
  Scenario: User should see the password in bullet signs by default
    When User enter password ,should see the password in bullet signs by default

  @BRT-351
  Scenario Outline:Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    When User enter valid "<Username>" and "<Password>" press Enter Key
    Then User should see the title is "#Inbox - Odoo"

    Examples:

      | Username                | Password     |
      | posmanager10@info.com   | posmanager   |
      | salesmanager10@info.com | salesmanager |










