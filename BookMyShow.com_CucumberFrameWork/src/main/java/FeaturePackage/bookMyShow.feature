Feature: Testing Book_My_Show Online ticket booking application

@RegressionTest
Scenario: Searching Sports activity in my city for coming weekend
Given User should land on application home page
Then User should select their city
Then user should select sports tab in the homepage
When verifying user is on Sports page
Then User should select This Weekend button
And Displaying Name of the sports
#Extracting and Displaying all the Languages for Movies
Then User should click on Movie Tab on home page
Then locate all Languages in Movie Section and Displaying as list
#signing with Invalid google credentials and capturing Error Message
Then User should click on Sign-In button and choose Continue with Google
Then User should enter invalid email id 
#using DataTable method for DataDriven
| abc123!@gmail.com |
And click on Sign-In button
Then Capture and display the Error message



@SmokeTest
Scenario: Searching Sports activity in my city for coming weekend
Given User should land on application home page
Then User should select their city
#signing with Invalid google credentials and capturing Error Message
Then User should click on Sign-In button and choose Continue with Google
Then User should enter invalid email id 
#using DataTable method for DataDriven
| abc123!@gmail.com |
And click on Sign-In button
Then Capture and display the Error message