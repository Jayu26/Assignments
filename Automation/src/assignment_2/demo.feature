
Feature: BDD_demo


Scenario: My first demo

Given User should be on page www.google.com.
	
When Enter "Times of India" in Search field.
	And Click on "Search" icon.

Then All the links related to "Times of India" should be displayed.
