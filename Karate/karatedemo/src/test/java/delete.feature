@test
Feature: Sample API tests
Scenario: Test a sample DELETE API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When method DELETE
Then status 200