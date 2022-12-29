@regression @smoke @SKYW-15 @E2E
Feature: HomeDepot Search Functionality

	Scenario: Search for Fridge
		Given Open Homedepot Homepage
		When Search for Fridge
		Then Item list should have only fridges related products