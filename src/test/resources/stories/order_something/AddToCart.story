Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Story: Add to Cart

GivenStories: stories/looking_for/LookupADefinition.story

Scenario: add a goods in the cart
Given i have searched for local items containing 'iPhone'
When I click the item
Then they should see the item description contains 'iPhone'