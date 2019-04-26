Feature: BBC GOOD FOOD FEATURE 


@JahedQuestionTwo
Scenario: User checks for a halloumi recipe on BBCGOODFOOD site 
	Given User is on BBC Good Food website 
	And User accpets cookies 
	And User goes to Recipe page 
	And User browseres a halloumi ingredients 
	Then User finds the perfect halloumi recipe 
	
	
@JahedRandomTest 
Scenario Outline: User tries to sign into BBCGOODFOOD page with incorrect password 
	Given User is on BBC Good Food website 
	And User clicks on Sign In button 
	And User enters "<Username>" and "<Password>" 
	Then User gets an error message "<errorMessage>" 
	
	Examples: 
		|Username|Password|errorMessage|
		|TestOne|WrongPassword|Error message|
#		|Jahed|Miah|Error message|
#		|ThankYouForWatching|WrongPassword|Error message|
#		