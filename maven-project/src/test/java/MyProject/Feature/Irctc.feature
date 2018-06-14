Feature: Testing irctc

  @Testirctc
  Scenario: Testing irctc
    Given user launches browser "chrome","https://www.irctc.co.in/eticketing/loginHome.jsf"
    #And user enters "Hello" text in textbox "User ID :"
    And user enters "Hello" text in textbox "Password"
    And user click "Search" button
    And user selects "value" from dropdown "label"
    And user selects "radiobutton" radio button "label"
    And user check "check/uncheck" checkbox "label"
    And user click "link" link
    And user click "image" image link
    And user launch page successfully
    And user enters text "" and "" for "label"
