Feature: Login Application Testing

Background:
Given setup entries in database
When launch the browser from the config variables
And hit the home page url of bankding site

@RegressionTest
Scenario: Admin Page default login

Given Admin on the login page
When Admin fill the username as "admin" and password as "1234"
And click on Login button
Then Should be navigate to home page
And should display the ministatement and check balance links

@MobileTest
Scenario: User Page default login

Given User on the login page
When User fill the username as "user" and password as "6789"
And click on Login button
Then Should be navigate to home page
And should display the ministatement and check balance links

@SmokeTest
Scenario Outline: CardUser Page default login

Given User on the login page
When User fill the username as <Username> and password as <Password>
And click on Login button
Then Should be navigate to home page
And should display the ministatement and check balance links

Examples:
  |  Username          |  Password    |
  |  Credit Card User  |  Akbar@0326  |
  |  Debit Card User   |  Malin@0326  |
  

@SmokeTest @RegressionTest
Scenario: User Signup form

Given User on the practice page
When User signup into application
| Shaik |
| AKbar |
| akbarshaik911@gmail.com |
| 9492667682 |
And click on Signup button
Then Should display the confirmation message