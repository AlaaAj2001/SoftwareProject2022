@tag
 Feature: Admin Login
 
 Scenario: Successfully Admin Login
 Given This user is an admin and his username "Admin" , Password is "adminpass" 
 When he entered his info 
 Then Login complete successfully and he can access the system administration 
 
Scenario: Failed Admin Login1
 Given This user has his username "Admin" , Password is "12347" 
 When he entered his info with wrong password
 Then Admin Login failed
 
 
 Scenario: Failed Admin Login2
 Given This user has his username "Adminn" , Password is "1234567" 
 When he entered his info with wrong both of them
 Then Admin Login failed
 
 