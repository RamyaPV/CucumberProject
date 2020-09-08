#Author: ***Ramya***
#Application : OrangeHRM
Feature: OrangeHRM Dashboard Validations

Background:  login the OrangeCRM with valid credentials
    Given User login with "username" ,"password" and  is in Dashboardpage
    

Scenario: Verify whether user is able to Assign Leave for an Employee in Dashboard page
    When user clicks the Assign leave link and  fills the Assign leave form for an Employee
    |EmployeeName      |Leave Type  |From Date|To Date|
    |Raj Rajan         |Vacation US |20       |31     |
    |Hema Hemaa        |Paternity US|13			  |21     |     
    Then User should be able to Assign leave for the Employee