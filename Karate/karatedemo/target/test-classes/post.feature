@test
Feature: Sample API tests
Scenario: Test a sample POST API
Given url 'https://jsonplaceholder.typicode.com/posts'
And request { "id": 101, "title": "foo", "body": "bar", "userId": 1 }
When method POST
Then status 201