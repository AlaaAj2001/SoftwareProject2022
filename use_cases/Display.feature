Feature: Dispaly
 
 
Background: Existing services and the team

Given Choice table
      
    | Services |    1   | 
    |   Team   |    2   | 
  
Given Team table
      
    | Suha  |    haircutting   |  
    | Nada  |    hairdyeing    | 
    | Aseel |   skincleaning   | 
    | Noor  |      makeup      | 
    | Manal |  proteinforhair  | 
    | Razan | cleaningeyebrows | 
    
Given Services table   
    |    haircutting   |  20   |
    |    hairdyeing    |  50   |
    |   skincleaning   |  50   |
    |      makeup      |  150  |
    |  proteinforhair  |  300  |
    | cleaningeyebrows |  25   |
    
Scenario: Display services request
 When Admin asked to display the services "1" that available in the salon with its price
 Then System show admin all services 
 
 Scenario: Display team request
 When Admin asked to display the The staff team "2" in the salon
 Then System show admin all employees
 