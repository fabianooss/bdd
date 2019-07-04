@tagSystem
Feature: Test Login

  Scenario Outline: Login Success and Failure
    Given I open Gestum Application
    When I try to login with "<user>" and "<password>"
    Then I should see page with title "<result_page>"

    Examples: 
      | user    | password | result_page          |
      | admin   | admin    | gestum 6             |
      | invalid | 1				 | gestum 6 [login]     |
      
 