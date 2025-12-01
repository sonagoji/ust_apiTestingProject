Feature: Testing PATCH Request

Scenario: Testing the API

Given The user is in the URL for patch which is https://jsonplaceholder.typicode.com/posts/1
When he sends Patch request
Then system sends a status code of 200