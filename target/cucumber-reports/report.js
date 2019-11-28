$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/OnlineCareerApplication.feature");
formatter.feature({
  "name": "Career Application",
  "description": "  Description: The purpose of this feature is to test if online career application is working",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Candidate applies for a career from online portal",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he navigate to Careers page",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.heNavigateToCareersPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he choose \"South Africa\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.heChoose(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he select the first available job",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.heSelectTheFirstAvailableJob()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he select apply online button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.heSelectButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "populate the name \"Name\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.populateTheName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "populate email address \"automationAssessment@iLABQuality.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.populateEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "populate phone number",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.populatePhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate text \"You need to upload at least one file.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.validateText(String)"
});
formatter.result({
  "status": "passed"
});
});