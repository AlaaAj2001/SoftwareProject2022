@tag
 Feature: Login Site
 
 Scenario: Successfully Login
 Given This user has his username "Alaa" , Password is "123456" 
 When he logged his info in and he is registered before
 Then Login complete successfully
 
Scenario: Failed Login1
 Given This user has his username "Alaa" , wrong Password is "12347" 
 When he logged in with wrong password
 Then Login failed
 
 
 Scenario: Failed Login2
 Given This user has his wrong username "Allaa" , wrong Password is "1234567" 
 When he logged in with wrong both of them
 Then Login failed
 