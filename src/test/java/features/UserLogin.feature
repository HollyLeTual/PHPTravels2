Feature:  UserLogin

  Scenario: Existing User Login
    Given User is on the home page
    And User has an exisiting account
     When User clicks on the My Account drop down
      And User clicks the Login button
     Then Login page is displayed
      And Login page displayed "true"