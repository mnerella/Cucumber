Feature: LoginFeature
  This feature deals with the login functionality of the application
 Scenario: Login with correct username and password
   Given I navigate to Login page
   And I enter username as admin and password as admin
   And I click login button
   Then I should see the userform page