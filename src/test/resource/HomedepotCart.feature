@regression @smoke @us-248
Feature: Homedepot Cart Functionality

Description: User should be able to add items in cart
Scenario:
Given open Home Page
Given Search for coals
When select the first coals option
And add shipping preference
And add quantity
Then add to cart
