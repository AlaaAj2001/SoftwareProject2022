Feature: Invoice
 
Background: 
   Given Users.
 
    |  Zena   |   haircutting  | 20  | 2/12/2022  |   12:00  |  
    |  Alaa   |   hairdyeing   | 50  | 7/11/2022  |   14:00  |
    |  Zena   |  skincleaning  | 50  | 7/12/2022  |   10:00  |
    |  Najwa  |     makeup     | 150 | 2/12/2022  |   12:30  |
    |  Alaa   |     makeup     | 150 | 26/10/2022 |   12:00  |
    
    
   
 Scenario: Invoice request
 Given This user has username "Zena" ,booked an appointment for "haircutting" ,and its price "20" ,on date "2/12/2022" ,at "12:00"
 When This user request his invoice 
 Then System print it to him