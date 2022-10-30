 Feature: Reservation
 
Background: 
   Given Pre-booked Users.
 
    |  Zena   |  0598177593 | haircutting  | 2/12/2022  |   12:00  |
    |  Alaa   |  0598479222 |  hairdyeing  | 7/11/2022  |   14:00  |
    |  Zena   |  0598177593 | skincleaning | 7/12/2022  |   10:00  |
    |  Najwa  |  0597336461 |    makeup    | 2/12/2022  |   12:30  |
    
   
 Scenario: Pre-existing reservation
 Given This user has username "Zena" ,PhoneNumber is "0598177593" ,booked an appointment for "haircutting",on date "2/12/2022" ,at "12:00"
 When this reservation exists 
 Then System show him it is already exist
 
 
 Scenario: User reservation does not exist before
 Given This user has username "Najwa" ,PhoneNumber is "0597336461" ,booked an appointment for "haircutting",on date "2/12/2022" ,at "12:00"
 When He has not reserved before
 Then This appointment has been successfully booked
 
 
 
 