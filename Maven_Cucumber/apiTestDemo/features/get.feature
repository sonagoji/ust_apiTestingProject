Feature: Testing GET Request

Scenario: Testing the API

Given the user is in the URL https://jsonplaceholder.typicode.com/posts/1
When he send the get request
Then he gets the response of 200
