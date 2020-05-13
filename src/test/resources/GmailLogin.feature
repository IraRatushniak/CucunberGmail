Feature: Verify gmail log in

  Scenario Outline: Verify that user can log in with correct credentials
    Given User stays on log in page
    When User insert correct login "<userEmail>"
    And  Click btn next for log in page
    Then User is redirected to Password Page
    When User insert correct password "<userPass>"
    And  Click btn next for gmail page
    Then User is redirected to Account Page for user "<userName>"

    Examples:
      | userEmail             | userPass         | userName   |
      | ratestagent@gmail.com | 12345ratestagent | Agent Test |