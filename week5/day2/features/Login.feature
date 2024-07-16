Feature: Leaftaps login feature

Background:
Given Launch the browser and load the url



Scenario: Login leaftaps application with positive credentials

#Given Launch the browser and load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify the login is Successfull
Given Close the browser


Scenario: Login leaftaps application with negative credentials

#Given Launch the browser and load the url
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But Verify the login is Successfull
Given Close the browser