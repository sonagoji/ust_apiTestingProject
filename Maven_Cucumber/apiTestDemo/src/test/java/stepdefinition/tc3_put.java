package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc3_put {

	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
	private static final String REQUEST_BODY=
			"{"+
				"\"id\":1,"+
				"\"title\":\"foo\","+
				"\"body\":\"bar\","+
				"\"userId\":1"+
			"}";
					
	@Given("the user is in the URL https:\\/\\/jsonplaceholder.typicode.com\\/posts")
	public void the_user_is_in_the_URL_https_jsonplaceholder_typicode_com_posts() {
		System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	}

	@When("he sends PUT request")
	public void he_sends_PUT_request() {
		System.out.println("He sends PUT request");
		request=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(REQUEST_BODY);
		response=request.put();
	}

	@Then("he recieves a status code of {int}")
	public void he_recieves_a_status_code_of(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println(response.getStatusCode());
		
	   
	}

}
