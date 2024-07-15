Feature: Leaftaps Create Lead feature

Scenario: Create lead with positive credentials

Given Launch the browser and load the url
And Enter the username
And Enter the password
When Click on the Login button
Then Verify the login is Successfull
When Click on the crmsfa
And Click on the leads tab
And Click on the CreateLead link
Given Enter the company name
And Enter the firstname 
And Enter the lastname
When Click on the create lead btn
Then Verify the create lead is successfull
Given Close the browser 