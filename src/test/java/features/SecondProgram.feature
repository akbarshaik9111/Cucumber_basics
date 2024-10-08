Feature: Login Application Testing

Background:
When launch the browser from the config variables
And hit the home page url of bankding site

@RegressionTest @NetBanking
Scenario: User Page default login

Given User on the login page
When User fill the username as "user" and password as "6789"
And click on Login button
Then Should be navigate to home page
And should display the ministatement and check balance links

@SmokeTest @Mortgage
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
  
