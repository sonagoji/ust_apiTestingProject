package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc4_patch {

	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
		
	private static final String REQUEST_BODY=
			"{"+
					"\"title\":\"foofoo\""+
			"}";

	@Given("The user is in the URL for patch which is https:\\/\\/jsonplaceholder.typicode.com\\/posts\\/{int}")
	public void the_user_is_in_the_URL_for_patch_which_is_https_jsonplaceholder_typicode_com_posts(Integer int1) {
	   System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	    
	}

	@When("he sends Patch request")
	public void he_sends_Patch_request() {
		System.out.println("User sends patch request");
		request=RestAssured.given()
				.contentType(ContentType.JSON)
				.body(REQUEST_BODY);
		response=request.patch();
				
	    
	}

	@Then("system sends a status code of {int}")
	public void system_sends_a_status_code_of(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println(response.getStatusCode());
	    
	}
}
