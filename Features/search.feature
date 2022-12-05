Feature: Search the product

@sanity
Scenario: Successfully displaying the product 
	Given User Launch browser
	And Opens URL "https://www.amazon.com/"
	When User enter the product as "JBL Speaker"
	And Click on Search button
	Then Selected product is displayed
	