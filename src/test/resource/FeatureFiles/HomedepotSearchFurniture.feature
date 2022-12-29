@regression @smoke @SKYW-15 @E2E
Feature: Homedepot Search Functionality

	Scenario: Search for Furnitures
		
		Given Open homedepot Homepage
		When Search for furniture
		Then Item list should have only furniture related product