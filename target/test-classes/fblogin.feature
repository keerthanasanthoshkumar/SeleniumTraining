@Features
Feature: To Validate the login of facebook application.

@sanity
Scenario: To validate login with username and password.
Given To launch  chrome browser and maximize the  window.
When To launch the facebook url.
And To enter the  username in email field.
And To enter the password in password field.
And To click signin button

@Regression
Scenario Outline: To validate the positive and negative combination of login functionality.
Given User has to launch  browser and maximize the  window.
When User has to enter the url of the facebook application
And User has to enter the data "<emaildatas>"in email field.
And User has to enter the data "<passworddatas>"in password field.
And User has to click the signin button.


Examples:
|emaildatas|passworddatas|
|keerthanajaskk@gmail.com|7708603903|
|keerthanasanthoshkumar1312@gmail.com|8508040575|
|keerthanasanthoshkumar1312@gmail.com|8610662417|
|abcdef@gmail.com|12345678|