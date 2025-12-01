package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_get {
	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	
	@Given("the user is in the URL https:\\/\\/jsonplaceholder.typicode.com\\/posts\\/{int}")
	public void the_user_is_in_the_URL_https_jsonplaceholder_typicode_com_posts(Integer int1) {
		System.out.println("User is in the URL page");
		RestAssured.baseURI=BASE_URL;
	}

	@When("he send the get request")
	public void he_send_the_get_request() {
		System.out.println("User sends the GET request");
		request=RestAssured.given();
		response=request.get(BASE_URL);
	}

	@Then("he gets the response of {int}")
	public void he_gets_the_response_of(Integer int1) {
		System.out.println("He gets a response of "+int1);
		output=response.asString();
		System.out.println(output);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
    
	}

}
