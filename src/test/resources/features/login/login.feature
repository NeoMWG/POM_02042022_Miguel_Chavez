Feature: Login on the platform
  @CorrectLogin
  Scenario: Correct Login

    Given that a customer has an active account
    When he enters with valid credentials
    Then the should be able to enter the platform successfully