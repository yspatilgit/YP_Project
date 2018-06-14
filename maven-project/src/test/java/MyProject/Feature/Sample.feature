Feature: Testing Test One

  @TestOne
  Scenario: Testing Test One1
    Given user launches browser "chrome","https://www.google.com"
    And user enters "Hello" text in textbox "Search"
    And user click "Search" button
    And user selects "value" from dropdown "label"
    And user selects "radiobutton" radio button "label"
    And user check "check/uncheck" checkbox "label"
    And user click "link" link
    And user click "image" image link
    And user launch page successfully
    And user enters text "" and "" for "label"
