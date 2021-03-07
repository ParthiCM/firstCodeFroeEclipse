$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/FeaturePackage/bookMyShow.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Book_My_Show Online ticket booking application",
  "description": "",
  "id": "testing-book-my-show-online-ticket-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Searching Sports activity in my city for coming weekend",
  "description": "",
  "id": "testing-book-my-show-online-ticket-booking-application;searching-sports-activity-in-my-city-for-coming-weekend",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should land on application home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User should select their city",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user should select sports tab in the homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verifying user is on Sports page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should select This Weekend button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Displaying Name of the sports",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#Extracting and Displaying all the Languages for Movies"
    }
  ],
  "line": 12,
  "name": "User should click on Movie Tab on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "locate all Languages in Movie Section and Displaying as list",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#signing with Invalid google credentials and capturing Error Message"
    }
  ],
  "line": 15,
  "name": "User should click on Sign-In button and choose Continue with Google",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should enter invalid email id",
  "rows": [
    {
      "comments": [
        {
          "line": 17,
          "value": "#using DataTable method for DataDriven"
        }
      ],
      "cells": [
        "abc123!@gmail.com"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on Sign-In button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Capture and display the Error message",
  "keyword": "Then "
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_land_on_application_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_select_their_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_select_sports_tab_in_the_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.verifying_user_is_on_Sports_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_select_This_Weekend_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.displaying_Name_of_the_sports_with_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_click_on_Movie_Tab_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.locate_all_Languages_in_Movie_Section_and_Displaying_as_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_click_on_Sign_In_button_and_choose_Continue_with_Google()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.user_should_enter_invalid_email_id(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.click_on_Sign_In_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bookMyShow_StepDefinition.Capture_and_display_the_Error_message()"
});
formatter.result({
  "status": "skipped"
});
});