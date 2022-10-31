 Feature: Visiting
 
Background: 
   Given booked Users with their state.
    
    
    |  Zena   | haircutting  | 2/12/2022  |   12:00  |  only booked  |
    |  Alaa   |  hairdyeing  | 7/11/2022  |   14:00  |  only booked  |
    |  Zena   | skincleaning | 7/12/2022  |   10:00  |  only booked  |
    |  Najwa  |    makeup    | 2/12/2022  |   12:30  |  only booked  |
    |  alaa   |    makeup    | 26/10/2022 |   12:00  |    visited    |
     
     
     
     
 Scenario: visited user 
 Given This user has username "Zena" ,came to his appointment "haircutting",on date "2/12/2022" ,at "12:00" ,he was "visited" 
 When he visited the center and was converted into a visitor already
 Then do nothing 
 
 
 Scenario: convert the appointment to visited
 Given This user has username "Zena" ,came to his appointment "haircutting",on date "2/12/2022" ,at "12:00" ,he was "visited"
 When it was time to visit and the user came, but the system had not converted his status to a visitor yet
 Then the system will convert his status to visited
 