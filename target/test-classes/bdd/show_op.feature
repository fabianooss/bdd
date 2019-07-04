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
@tagPPCP
Feature: Show OP
  Como um usuário do PPCP, eu gostaria de ver todas as OPs

  Scenario: Show all OPs
    Given I am a valid user
    When I click on menu "PPCP"
    And I click on submenu "Ordem de produção"
    Then I see all ops
 


