Feature: Accessingmyinfodeatils

  Scenario: Editing the myinfo data
     Given User is on the Website homepage
    When User enters the valid username and password
    And User clicks the login button
    And user clicks the Myinfo category
    And user enters the firstname, lastname, and nickname
    And user enters the employeeid, otherid, Driver's License Number, License Expiry Date, SSN Number, and SIN Number
    And user enters the select the value of Nationality, Marital Status, Date of Birth, and Gender
    And user clicks the save button
    And user selects the blood group
    And user clicks the bloodgroup save button
    Then user is able to see the edited details