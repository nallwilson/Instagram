Feature: Instagram Login, search account, message
  Scenario: successful login
    Given user is on login page
    When user login with "ronaldwilsonlainardi@gmail.com" and "ronald030298"
    Then user should be logged in successfully

    When user enter "fidelafortunata" in search bar
    Then user should be on "fidelafortunata"'s instagram

    When user click direct message icon
    Then user should be on direct message page

    When message someone with "halo bos"
    Then "halo bos" should have been sent