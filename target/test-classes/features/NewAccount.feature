Feature:  New Account Creation

  Scenario: Create Account
    Given User is on the home page
     When User clicks on the My Account drop down
      And User clicks the Sign Up button
     Then Sign Up page is displayed
      And Sign Up page displayed "true"