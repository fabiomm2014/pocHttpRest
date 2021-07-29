package pocHttpRest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class GetRestAssured {

	public static void main(String[] args) {
	Response response =	RestAssured.request(Method.GET, "https://www.example.com.br");
	
	System.out.println(response.asString());

	}

}
