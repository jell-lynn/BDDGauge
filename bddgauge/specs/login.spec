# User Login

## Scenario 1: Successful Login
* I am a registered user
* I have navigated to the login page
* I enter my valid username and password
* I click on the "Login" button
* I should be redirected to the dashboard
* I should see a welcome message

## Scenario 2: Unsuccessful Login with Incorrect Password
* I am a registered user
* I have navigated to the login page
* I enter my valid username but an incorrect password
* I click on the "Login" button
* I should see an error message saying "Invalid credentials"
* I should remain on the login page

## Scenario 3: Login with Empty Fields
* I am on the login page
* I leave the username and password fields empty
* I click on the "Login" button
* I should see an error message saying "Username and Password are required"