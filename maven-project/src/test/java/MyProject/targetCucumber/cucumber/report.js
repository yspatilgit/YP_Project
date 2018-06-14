$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Test One",
  "description": "",
  "id": "testing-test-one",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing Test One",
  "description": "",
  "id": "testing-test-one;testing-test-one",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestOne"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user launches browser \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user launcing application with URL \"https://www.google.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});