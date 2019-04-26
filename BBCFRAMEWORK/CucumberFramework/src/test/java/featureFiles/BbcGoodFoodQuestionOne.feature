#Jahed Miah
Feature: BBC GOOD FOOD FEATURE 


@JahedGCMandate
Scenario Outline: User Signs into BBCGOODFOOD page 
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User enters "<Username>" and "<Password>"
And User clicks Sign In button
Then User is redirected to dashboard  


	Examples: 
		|Username|Password|
		|TestOne|Passw0rd|
		
Scenario Outline: New User creating an account with BBCGOODFOOD 
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User enters "<Username>" and "<Password>"
And User clicks Sign In button
Then User is redirected to dashboard 

	Examples: 
		|Username|Password|
		|TestOne|Passw0rd|
		
Scenario Outline: User tries to sign into BBCGOODFOOD page with incorrect password
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User enters "<Username>" and "<Password>"
And User clicks Sign In button
Then User is shown the invalid password or username message 

	Examples: 
		|Username|Password|
		|TestOne|WrongPassword|
		|TestOne|1|
		|TestOne|One|
		|TestOne|jwdj09|
		
Scenario Outline: User tries to sign into BBCGOODFOOD page with incorrect username
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User enters "<Username>" and "<Password>"
And User clicks Sign In button
Then User is shown the invalid password or username message 

	Examples: 
		|Username|Password|
		|WrongUsername|Passw0rd|
		|ee33|Passw0rd|
		
Scenario Outline: User tries to sign into BBCGOODFOOD page with Facebook
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User clicks on Sign in with Facebook
And User enters "<FaceBookUsername>" and "<FaceBookPassword>"
And User clicks Sign In button
Then User is redirected to dashboard 

	Examples: 
		| Username| Password |FaceBookUsername | FaceBookPassword|
		|Username | Passw0rd | FacebookUsername| FaceBookPassword |
		
Scenario Outline: User tries to sign into BBCGOODFOOD page with Google
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User clicks on Sign in with Facebook
And User enters "<GoogleUsername>" and "<GooglePassword>"
And User clicks Sign In button
Then User is redirected to dashboard 

	Examples: 
		| Username| Password |GoogleUsername| GooglePassword|
		|Username | Passw0rd | FacebookUsername| FaceBookPassword |
		

Scenario Outline: User navigates to recipe from homepage
Given User is on BBC Good Food website
And User accpets cookies 
And User clicks on Sign In button 
And User clicks on Sign in with Facebook
And User enters "<GoogleUsername>" and "<GooglePassword>"
And User clicks Sign In button
Then User is redirected to dashboard 

	Examples: 
		| Username| Password |GoogleUsername| GooglePassword|
		|Username | Passw0rd | FacebookUsername| FaceBookPassword |
		