@regression @smoke @us-246
Feature: Homedepot Brand Outline

Description: User should able to filter items by Brand

	Background: 
		Given Open Homedepot Homepage
	
	Scenario Outline: Filter items by Brand
		Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		|Brand		|
		|Fridge		|Whirlpool	|
		|Cement		|Sika	    |