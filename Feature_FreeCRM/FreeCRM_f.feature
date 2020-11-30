Feature: FreeCRM Website

Background: User is already navigated to FreeCRM homepage 

Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters UserName and Password
    And clicks on login button
    Then User is navigated to FreeCRM main page
    
Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters invalid UserName and Password
    And clicks on login button
    Then Display alert Message 

 

Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters UserName and leaves Password empty
    And clicks on login button
    Then Display alert Message 
    
    
Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enters Password and leaves UserName empty
    And clicks on login button
    Then Display alert Message 
Scenario: Successful LogOut
    When User LogOut from the Application
    Then User is sucessfully signed out