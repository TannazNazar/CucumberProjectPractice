Feature: Register an Account on FreeCrm

  Scenario: Adding valid credentials user info
    
    Given I open the browser
    When I navigate to the FreeCrm 
    And I enter the credentials info
    And Checked the terms and conditions button
    And Click on submit button
    Then I succesfully created an account

