$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fblogin.feature");
formatter.feature({
  "name": "To Validate the login of facebook application.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Features"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with username and password.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Features"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To launch  chrome browser and maximize the  window.",
  "keyword": "Given "
});
formatter.match({
  "location": "PositiveAndNegativeFb.to_launch_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the facebook url.",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeFb.to_launch_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the  username in email field.",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeFb.to_enter_the_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the password in password field.",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeFb.to_enter_the_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click signin button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeFb.to_click_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the positive and negative combination of login functionality.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch  browser and maximize the  window.",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter the url of the facebook application",
  "keyword": "When "
});
formatter.step({
  "name": "User has to enter the data \"\u003cemaildatas\u003e\"in email field.",
  "keyword": "And "
});
formatter.step({
  "name": "User has to enter the data \"\u003cpassworddatas\u003e\"in password field.",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click the signin button.",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "keerthanajaskk@gmail.com",
        "7708603903"
      ]
    },
    {
      "cells": [
        "keerthanasanthoshkumar1312@gmail.com",
        "8508040575"
      ]
    },
    {
      "cells": [
        "keerthanasanthoshkumar1312@gmail.com",
        "8610662417"
      ]
    },
    {
      "cells": [
        "abcdef@gmail.com",
        "12345678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Features"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch  browser and maximize the  window.",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"keerthanajaskk@gmail.com\"in email field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"7708603903\"in password field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the signin button.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Features"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch  browser and maximize the  window.",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"keerthanasanthoshkumar1312@gmail.com\"in email field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"8508040575\"in password field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the signin button.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Features"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch  browser and maximize the  window.",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"keerthanasanthoshkumar1312@gmail.com\"in email field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"8610662417\"in password field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the signin button.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the positive and negative combination of login functionality.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Features"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch  browser and maximize the  window.",
  "keyword": "Given "
});
formatter.match({
  "location": "FbLogin.user_has_to_launch_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"abcdef@gmail.com\"in email field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the data \"12345678\"in password field.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_enter_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the signin button.",
  "keyword": "And "
});
formatter.match({
  "location": "FbLogin.user_has_to_click_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
});