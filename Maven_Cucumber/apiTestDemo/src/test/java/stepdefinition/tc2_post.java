package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc2_post {


	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY = 
		       "{"+
		        	"\"title\":\"foo\","+
		        	"\"body\":\"bar\","+
		        	"\"userId\":1"+
		       "}";
		        		

	@Given("The user is in the URL https:\\/\\/jsonplaceholder.typicode.com\\/posts")
	public void the_user_is_in_the_URL_https_jsonplaceholder_typicode_com_posts() {
		System.out.println("User enters URL");
	    RestAssured.baseURI=BASE_URL;
	    request=RestAssured.given()
	    		.contentType(ContentType.JSON)
	    		.body(REQUEST_BODY);
	}

	@When("he sends a POST request")
	public void he_sends_a_POST_request() {
		System.out.println("User sends POST request");
		response=request.post();
	    
	}

	@Then("he gets a status code of {int}")
	public void he_gets_a_status_code_of(Integer int1) {
		System.out.println("He gets a response of "+int1);
		output=response.asString();
		System.out.println(output);
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
	    
	}
}
