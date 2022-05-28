Feature: Login Functionality

Background: Succesfully cancel intial login page
When user open "Chrome" browser with exe 
When user open url as 
When user cancle initial Login window

@SmokeTest
Scenario: Login Fuctionality with valid credentials
When user navigate on Login button
When user click on MyProfile
When user enter "8308528195" as username 
When user enter "Shital@123" as password 
When user click on Login button
Then Application shows user profile to user

		
@RegressionTest
	Scenario Outline: Login Fuctionality by using invalid username in UC and valid password
When user navigate on Login button
When user click on MyProfile
When user enters <username> as username 
When user enters <password> as password 
When user click on Login button
Then Application shows appropriate error message


Examples: 
            |username|password|
            |ABCDS|Shital@123|
            |8308528195|SHITAL@123|

