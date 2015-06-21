Feature: verify successful login

Scenario: Verify that user is able to login successfully with valid credentials
Given user is on login page
When user enters valid username and passsword and click login
Then user is loggedin