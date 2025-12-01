@test
Feature: Sample API tests
Scenario: Test a sample PUT API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
And request { "id": 1, "title": "foo", "body": "bar", "userId": 1 }
When method PUT
Then status 200