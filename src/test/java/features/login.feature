Feature: Login Test

  Scenario: Login with valid email and password
    Given I am at TalentTEK homepage
    And I enter valid email address
    And I enter valid password
    When I click on the Login Button
    Then I should be able to successfully log in

  Scenario: Login with invalid email and password
    Given I am at TalentTEK homepage
    And I enter invalid email address
    And I enter valid password
    When I click on the Login Button
    Then I should not able to log in

  Scenario: Login with valid email and invalid password
    Given I am at TalentTEK homepage
    And I enter valid email address
    And I enter invalid password
    When I click on the Login Button
    Then I should not able to log in

  Scenario: Login with invalid email and invalid password
    Given I am at TalentTEK homepage
    And I enter invalid email address
    And I enter invalid password
    When I click on the Login Button
    Then I should not able to log in

