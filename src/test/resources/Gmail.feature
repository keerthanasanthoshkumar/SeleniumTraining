Feature: To Validate the login functionality of gmail application.

Scenario: To validate login with username .

Given To launch the browser and maximize window.
When To launch the url of the gmail application
And To pass the valid email in email field.
And To click the next button.

Scenario Outline: To validate the positive and negative combination of login functionality.
Given User has to launch the browser and maximize the  window.
When User has to hit the url of the gmail application
And User has to pass the data "<emaildatas>"in email field.
And User has to click the next button.

Then User has to close the browser.

Examples:
|emaildatas|
|keerthanajaskk@gmail.com|
|keerthanasanthoshkumar1312@gmail.com|
|keerthanasanthoshkumar1312@gmail.com|
|abcdef@gmail.com|