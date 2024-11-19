Feature: To validate the login functionality of amazon application.

Scenario: To validate the login credentials.
Given To launch the chrome browser and maximize the window.
When To launch the url of the amazon application.
And To navigate to the signin page.
And To pass the mobile no and email in email text box.
|keerthanajaskk@gmail.com|selenium@gmail.com|8508040575|
|automationtest@gmail.com|9487704203|abcdef@gmail.com|
And To navigate to the continue button.
Then To the close the browser.

