Feature: LoginPage

  @login
  Scenario Outline: User is trying to login
    Given User is on Login Page
    When User enters <Username> and <Password>
    And User clicks on Login button
    Then User should be logged in

    Examples: 
      | Username   | Password    |
      | "aa.akhil.achanta@gmail.com" | "180495aa" |

@title
Scenario: Get Title
Given User is already on flipkart
When user does nothing
Then Get Title

@home
Scenario: options available on home page
Given User is already on Home Page
When user needs he options available
Then user should see the list and count of the options avialable
