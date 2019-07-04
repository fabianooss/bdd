@Engenharia
Feature: Show products
  As an employee of the company I want to use all products 

#  Background: User logged in
#  	Given I am a valid user
#  	Then I should see page with title "<result_page>"

  Scenario: Show all products
    Given I am a valid user
    When I click on menu "Engenharia"
    And I click on submenu "Produto"
    Then I see all products


