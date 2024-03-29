Feature: Reservation
 
Background: 
   Given Pre-booked Users.
 
    |  Zena   |  0598177593 | haircutting  | 2/12/2022  |   12:00  |  
    |  Alaa   |  0598479222 |  hairdyeing  | 7/11/2022  |   14:00  |
    |  Zena   |  0598177593 | skincleaning | 7/12/2022  |   10:00  |
    |  Najwa  |  0597336461 |    makeup    | 2/12/2022  |   12:30  |
    |  Alaa   |  0598479222 |    makeup    | 26/10/2022 |   12:00  |
    
    
   
 Scenario: Pre-existing reservation
 Given This Pre-existing user has username "Zena" ,PhoneNumber is "0598177593" ,booked an appointment for "haircutting" ,on date "2/12/2022" ,at "12:00"
 When this reservation exists 
 Then System show him it is already exist
 
 
 Scenario: User reservation does not exist before and system allow to add it
 Given This user does not exist before has username "Najwa" ,PhoneNumber is "0597336461" ,booked an appointment for "haircutting" ,on date "2/12/2022" ,at "12:00"
 When He has not reserved before and system allow to book it 
 Then This appointment has been successfully booked
 
 Scenario: User reservation does not exist before and system does not allow to add it
 Given This user does not exist before his username "Najwa" ,PhoneNumber is "0597336461" ,booked an appointment for "haircutting" ,on date "2/12/2022" ,at "12:00"
 When He has not reserved before and system does not allow to book it 
 Then This reservation was rejected
 
 