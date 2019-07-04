#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tagEngenharia
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


