Feature: Instagram Login, search account, message
  Scenario: successful login
    Given user is on login page
    When user login with "ronaldwilsonlainardi@gmail.com" and "ronald030298"
    Then user should be logged in successfully

    When the user enter fidelafortunata in search bar
    And click search
    Then the user should be on fidela's instagram

    When the user click direct message icon
    Then the user should be on direct message page

    When the user click ronaldwilsonnn on list
    And type "halo bos"
    And click send
    Then the user should have sent "halo bos"