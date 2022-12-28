@regression @smoke @SKYW-15 @E2E
Feature: Home Depot login functionality

Scenario: login to Home Depot account
Given open Home Depot login page
When insert the wrong credentials
When click on continue button
Then it should  take you to page next 
