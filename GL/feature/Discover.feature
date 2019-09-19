@Manjula
Feature: Popular shows in Discovery site 
Scenario: List out episode title and duration of Discovery shows 
	Given Navigate to "https://go.discovery.com/" 
	When Scroll down to popular shows 
	And Go to the last video by pressing the icon and click on EXPLORE THE SHOW 
	And Click on SHOW MORE button twice and you will see the list of shows 
	Then Fetch episode title and duration in a file