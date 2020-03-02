$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/registration.feature");
formatter.feature({
  "name": "User Should able to register successfully,",
  "description": "  So that he can use all user features from our website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should able to register",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_is_on_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all registration details",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_enters_all_registration_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat WebTest.Utils.assertURL(Utils.java:34)\r\n\tat WebTest.RegistrationResultPage.verifyUserSeeRegistrationSuccessMessage(RegistrationResultPage.java:13)\r\n\tat WebTest.MyStepDefs.user_should_able_to_register_successfully(MyStepDefs.java:31)\r\n\tat ✽.user should able to register successfully(file:///C:/Users/User/IdeaProjects/untitled/NopCom/./src/test/resources/features/registration.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});