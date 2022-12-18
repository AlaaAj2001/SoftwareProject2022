@tag
 Feature: Signup
 

Background: Pre-registered Users.

Given Registered users
      
 |   Zena    |   12345    | 0598177593 |           
 |   Alaa    |   123456   | 0598479222 |
 |   Najwa   |   123456   | 0597336461 |
 
 
 
 Scenario: Pre-existing user registration
 Given This user has username "Alaa" , Password is "123456" and PhoneNumber is "0598479222" 
 When he is registered before
 Then System show him it is already registered
 
Scenario: User registration does not exist before
 Given This user does not exist before has username "Mera" , Password is "12347" and PhoneNumber is "0598479222"
 When He has not registered before
 Then The registration has been completed successfully
 