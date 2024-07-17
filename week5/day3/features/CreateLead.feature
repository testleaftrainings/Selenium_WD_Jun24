Feature: Leaftaps Create Lead feature

@createLead  @smoke
Scenario: Create lead with positive credentials

#Given Launch the browser and load the url
And Enter the username as 'Democsr'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify the login is Successfull
When Click on the crmsfa
And Click on the leads tab
And Click on the CreateLead link
Given Enter the company name as TestLeaf
And Enter the firstname as Gokul
And Enter the lastname as Sekar
When Click on the create lead btn
Then Verify the create lead is successfull
#Given Close the browser 