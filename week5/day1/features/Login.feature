Feature: Leaftaps login feature

Scenario: Login leaftaps application with positive credentials

Given Launch the browser and load the url
And Enter the username
And Enter the password
When Click on the Login button
Then Verify the login is Successfull
Given Close the browser