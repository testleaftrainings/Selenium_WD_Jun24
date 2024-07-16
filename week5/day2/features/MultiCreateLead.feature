Feature: Leaftaps Create Lead feature

Background:
Given Launch the browser and load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then Verify the login is Successfull
When Click on the crmsfa
And Click on the leads tab
And Click on the CreateLead link


Scenario Outline: Create lead with positive credentials

Given Enter the company name as <cname>
And Enter the firstname as <fname>
And Enter the lastname as <lname>
When Click on the create lead btn
Then Verify the create lead is successfull
Given Close the browser 

Examples:
|cname|fname|lname|
|Qeagle|Babu|M|
#|TestLeaf|Gokul|Sekar|
#|TestLeaf|Dilip|R|


Scenario: Create lead with positive credentials

Given Enter the company name as TestLeaf
And Enter the firstname as Gokul
And Enter the lastname as Sekar
When Click on the create lead btn
Then Verify the create lead is successfull
Given Close the browser 
