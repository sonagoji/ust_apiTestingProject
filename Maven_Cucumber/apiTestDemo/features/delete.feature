Feature: Testing DELETE Request

Scenario: Testing the API

Given The user is in the URL for DELETE which is https://jsonplaceholder.typicode.com/posts/1
When the user sends delete request
Then the system sends a status code of 200 to the user