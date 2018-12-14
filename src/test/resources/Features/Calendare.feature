Feature: calendare

	Scenario: Create a new event
	
	 Given I open the browser
    And I navigate to the FreeCrm 
    When I log in 
    And I click on calendare, New Event
    And Fill out the title from date to date,choose important category 
    Then Click on save button 
