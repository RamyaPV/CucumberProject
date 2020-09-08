#Author: ***Ramya***
#Application : OrangeHRM
Feature: OrangeHRM PIM page validations
  

  
  Background:  login the OrangeCRM with valid credentials
    Given User login with "username" ,"password"
    
    
    Scenario: verify whether the user is able to add an Employee
    When User Clicks the Add Employee Link and fills the employee details
   	|firstName|lastName  |
    |Raj     	|Rajan  	 |
    |Hema			|Hemaa		 |

    Then Employee should be added successfully
    
    Scenario: verify whether the user is able to Edit the Employee Profile
    When User Clicks the Edit  and fills the employee Personal details
   	|empname  |gender|nationality|Marital status|DOB       |
    |Raj Rajan|1     |Indian  	 |Single        |1990-10-05|
    |Hema Hema|2		 |Greek		   |Maried        |1989-02-20|

    Then Employee details should be edited and successfully
   
    
    
    
    

  