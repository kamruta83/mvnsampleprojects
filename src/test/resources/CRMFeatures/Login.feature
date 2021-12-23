Feature: CRM Login Feature 

#Scenario:Valid Login
#Given User is already on login page 
#When User enters login credentials 
#Then User is on Home page 


Scenario:Valid Login
Given User is already on login page 
When User enters "tomsmith" and "SuperSecretPassword!" 
Then User is on Home page 