@tag
 Feature: Services
 
Background: Existing services 
Given Services that already exist
      
    |    haircutting   |  20   |
    |    hairdyeing    |  50   |
    |   skincleaning   |  50   |
    |      makeup      |  150  |
    |  proteinforhair  |  300  |
    | cleaningeyebrows |  25   |
  
 
 Scenario: Pre-existing services
 Given This services "hairdyeing" ,which its price is "50"
 When it is entered before
 Then System show admin that this service is one of the services provided by the salon 
 
Scenario: Not-existing services
 Given This services "skincare" ,which its price is "100"
 When it is not entered before
 Then The admin will enter it into the system 