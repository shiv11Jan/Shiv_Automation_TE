$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LA_login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "\nScenario outline: User should be able to login successfully\n\nGiven user is on HomePage\n\nWhen user logins to page \n\nAnd enters valid Credentials\n\n\nAnd clicks on the Login button\n\nThen Successful login message should be displayed on the console window",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestngTest"
    }
  ]
});
});