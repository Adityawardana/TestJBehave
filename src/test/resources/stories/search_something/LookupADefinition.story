Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Looking up for 'iPhone'
Given the user is on the Blibli home page
And the popup is appear
When the user looks up for 'iPhone'
Then they should see a definition containing the words 'iPhone'

Scenario: add a goods in the cart
Given i have searched for local items containing 'iPhone'
When I click the item
Then they should see the item description contains 'iPhone'