package stepdefinition;
import java.net.ResponseCache;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc5_delete {

	
	private static final String BASE_URL="https://jsonplaceholder.typicode.com/posts/1";
	Response response;
	RequestSpecification request;
	String output;
		
	@Given("The user is in the URL for DELETE which is https:\\/\\/jsonplaceholder.typicode.com\\/posts\\/{int}")
	public void the_user_is_in_the_URL_for_DELETE_which_is_https_jsonplaceholder_typicode_com_posts(Integer int1) {
		System.out.println("User is in the URL");
		RestAssured.baseURI=BASE_URL;
	}

	@When("the user sends delete request")
	public void the_user_sends_delete_request() {
		System.out.println("User sends DELETE request");
		request=RestAssured.given();
		response=request.delete();
	    
	}

	@Then("the system sends a status code of {int} to the user")
	public void the_system_sends_a_status_code_of_to_the_user(Integer int1) {
		output=response.asString();
		System.out.println(output);
		System.out.println(response.getStatusCode());
	    
	}
	
}
