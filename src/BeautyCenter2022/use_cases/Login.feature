
 @tag
 Feature: Login
 @tag1
 Scenario: Correct email and password
 
 users should receive a notification that the login was done correctly 
 and then be greated after logging in.
 
 Given I have chosen to login
 When I log in with the correct email and password
 Then I should receive a notification that the login was done correctly 
 And I should see a welcomed message
 
 @tag2
 Scenario: Correct email and wrong password
 
 users should receive a notification that the login was incorrectly.
 
 Given I have chosen to login
 When I log in with the correct email and wrong password
 Then I should receive a notification that the login was incorrectly 
 And I should see a warning message to try again
 
 
 
 @tag3
 Scenario:  Wrong email and correct password
 
 users should receive a notification that the login was incorrectly.
 
 Given I have chosen to login
 When I log in with the wrong email and correct password
 Then I should receive a notification that the login was incorrectly 
 And I should see a warning message to try again
 
 
 @tag4
 Scenario:  Wrong email and wrong password
 
 
 users should receive a notification that the login was incorrectly.
 
 Given I have chosen to login
 When I log in with the wrong email and wrong password
 Then I should receive a notification that the login was incorrectly 
 And I should see a warning message to try again
 
 @tag5
 Scenario Outline: Login site.
Given I have chosen to login
When I enter Email as "<Email>" and Password as "<Password>"
Then login should be successful
 
 

 Examples:
 
 |       Email        |     Password      |      
 |zena.emad@gmail.com |      1548796      |            
 |alaa.ajaj@gmail.com |      1245789      |            
 
 
 

 