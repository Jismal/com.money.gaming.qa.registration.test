Feature: Test Registration page
  As a new moneymaking.com player
  I want to be able to register using my full details
  So that I can play online casino games

  Scenario: Register using insufficient data e.g.with out date of birth
    Given I am on home page
    When I click on 'Join now'
    And I select a valid title from the dropdown
    And I enter <firsts Name>, <surName>
    And I click on the tick box 'I accept the Terms and Conditions and certify that I am over the age of 18.'
    And I click on JOIN NOW button
    Then I should get a message text 'This field is required'