package ApiSteps;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;

public class jiraAPI {
    public static String URL = "https://edujira.ifellow.ru";

    public static void authUser(){
        Response authConfirmation = given()
                .baseUri(URL)
                .auth()
                .preemptive()
                .basic("shkambarny","Qwerty123")
                .when()
                .get("/rest/api/2/myself")
                .then()
                .log()
                .all()
                .extract()
                .response();
        Assertions.assertEquals(authConfirmation.jsonPath().get("emailAddress").toString(),"todojagami@gmail.com");

       System.out.println(authConfirmation.asString());
    }
}
