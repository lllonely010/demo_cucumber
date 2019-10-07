$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/Login.feature");
formatter.feature({
  "name": "Login in the application",
  "description": "  As a registered user of the application\n  I want to validate the login funtionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login failed with invaild username or password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@failedLogin"
    }
  ]
});
formatter.step({
  "name": "I navigate to the Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I login the system with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "There is an error message as \"\u003calert\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "alert"
      ]
    },
    {
      "cells": [
        "qaskillschallenge111@geophy.com",
        "qaskillschallenge@geophy.com",
        "There was an error with your e-mail or password, please try entering your login credentials again."
      ]
    },
    {
      "cells": [
        "qaskillschallenge@geophy.com",
        "qaskillschallenge111@geophy.com",
        "There was an error with your e-mail or password, please try entering your login credentials again."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login failed with invaild username or password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@failedLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigateTo_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login the system with \"qaskillschallenge111@geophy.com\" and \"qaskillschallenge@geophy.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.perform_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There is an error message as \"There was an error with your e-mail or password, please try entering your login credentials again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_ErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login failed with invaild username or password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@failedLogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigateTo_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login the system with \"qaskillschallenge@geophy.com\" and \"qaskillschallenge111@geophy.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.perform_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "There is an error message as \"There was an error with your e-mail or password, please try entering your login credentials again.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_ErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("classpath:features/Search.feature");
formatter.feature({
  "name": "Verify search property",
  "description": "  As a loged in user\n  I want to search property in the application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@validSearch"
    }
  ]
});
formatter.step({
  "name": "user is on Search Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I search property with \"\u003caddress\u003e\" and \"\u003cnoi\u003e\" and \"\u003cunits\u003e\" and \"\u003cyear_built\u003e\" and \"\u003cyear_renovation\u003e\" and \"\u003coccupancy\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I check and run valuation",
  "keyword": "And "
});
formatter.step({
  "name": "user is on Report page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "address",
        "noi",
        "units",
        "year_built",
        "year_renovation",
        "occupancy"
      ]
    },
    {
      "cells": [
        "555 N. College Avenue, Tempe, AZ, 85281",
        "2 000 000",
        "200",
        "2000",
        "",
        "80%"
      ]
    }
  ]
});
formatter.background({
  "name": "Login successfully",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.navigateTo_LoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login the system with \"qaskillschallenge@geophy.com\" and \"qaskillschallenge@geophy.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.perform_Login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@validSearch"
    }
  ]
});
formatter.step({
  "name": "user is on Search Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.validate_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search property with \"555 N. College Avenue, Tempe, AZ, 85281\" and \"2 000 000\" and \"200\" and \"2000\" and \"\" and \"80%\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.search_Property(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check and run valuation",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.validate_Run_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Report page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validate_Report_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});