#Author:tanaz.nazar@gmail.com
Feature: Registration

  Scenario: Create a new account 
    
    Given I open the browser
    When I navigate to the FreeCrm 
    And I click on sign up button
    And I fillup "Free Edition" and "Tannaz" and "Nazar" and "Tanaz.nazar@gmail.com" and "Tanaz.nazar@gmail.com" and "TannazNazar" and "Password12345@" and "Password12345@"
    And Checked the terms and conditions button
    And Click on submit button
    Then I succesfully created an account
    



