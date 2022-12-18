Feature: Report
 
Background: 
   Given Users Reservations.
 
    |  Zena   |   haircutting  | 20  | 2/12/2022  |   12:00  |  
    |  Alaa   |   hairdyeing   | 50  | 7/11/2022  |   14:00  |
    |  Zena   |  skincleaning  | 50  | 7/12/2022  |   10:00  |
    |  Najwa  |     makeup     | 150 | 2/12/2022  |   12:30  |
    |  Alaa   |     makeup     | 150 | 26/10/2022 |   12:00  |
    
    
   
 Scenario: Report request
 When Admin request this report at month "12"
 Then System show it to him