package apirun;

import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.response.Response;

public class API {
 // @Test
 /* public void f() {
	  Response it=get("https://reqres.in/api/users?page=2");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
  }*/
  @Test
  public void f6() {
	  File ti=new File("C:\\Users\\Owner\\eclipse-workspace\\bootcamp\\Entery.json");
	  Response it=given().contentType(ContentType.JSON).body(ti).post("http://dummy.restapiexample.com/api/v1/create");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
	  int status=get().statusCode();
	  Assert.assertEquals(status, 2001);
  }
}
