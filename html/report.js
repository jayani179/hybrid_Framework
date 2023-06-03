$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "nopCommerce Registration",
  "description": "",
  "id": "nopcommerce-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7804959300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Nopcommerce Valid Registration Test",
  "description": "",
  "id": "nopcommerce-registration;nopcommerce-valid-registration-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User click on Register Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user verify registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter Registration details",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on register button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_click_on_Register_Link()"
});
formatter.result({
  "duration": 502276000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_verify_registration_page()"
});
formatter.result({
  "duration": 40841300,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_enter_Registration_details()"
});
formatter.result({
  "duration": 504827000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.click_on_register_button()"
});
formatter.result({
  "duration": 17600,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.verify_the_message()"
});
formatter.result({
  "duration": 6238600,
  "status": "passed"
});
formatter.after({
  "duration": 657754100,
  "status": "passed"
});
});