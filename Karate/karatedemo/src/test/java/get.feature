@test
Feature: Sample API tests
Scenario: Test a sample GET API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When method GET
Then status 200
