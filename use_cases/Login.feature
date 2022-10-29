@tag
 Feature: Login Site
 
#Background: Pre-registered Users.
#Given users logged in 
#      
# |   Zena    |   12345    | 0598177593 |           
# |   Alaa    |   123456   | 0598479222 |
# |   Najwa   |   123456   | 0597336461 |
# 
# 
 
 Scenario: Successfully Login
 Given This user has his username "Alaa" , Password is "123456" 
 When he logged his info in and he is registered before
 Then Login complete successfully
 
Scenario: Failed Login1
 Given This user has his username "Alaa" , Password is "12347" 
 When he logged in with wrong password
 Then Login failed
 
 
 Scenario: Failed Login2
 Given This user has his username "Allaa" , Password is "1234567" 
 When he logged in with wrong both of them
 Then Login failed
 
 