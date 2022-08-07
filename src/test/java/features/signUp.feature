Feature: Signup Test

  Background: Navigating to signup page
    Given I am at TalentTEK signup page

  @signup
  Scenario: Sign up with valid email address
    Given : I am at TalentTEK Homepage
    And I click on Create New Account Button
    And I create a brand new student account
    And I click on Login link
    When I login with brand new student credentials
    Then I should be able to successfully log in
