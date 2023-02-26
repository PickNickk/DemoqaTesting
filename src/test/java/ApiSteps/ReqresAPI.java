package ApiSteps;

import io.restassured.response.Response;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.*;

import static Specifications.SpecificationsAPI.requestSpec;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class ReqresAPI {
    public static String URL = "https://reqres.in/";

    public static void createUser() {
        Response changeUser = given()
                .spec(requestSpec(URL))
                .when()
                .body(reName().toString())
                .post("api/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Tomato"))
                .body("job",equalTo("Eat maket"))
                .body("id",notNullValue())
                .body("createdAt",notNullValue())
                .extract()
                .response();

        System.out.println(changeUser.asString());
    }

    public static JSONObject getJSONObject(String fileName) {
        try {
            return new JSONObject(new String(Files.readAllBytes(Paths.get("src/test/resources/" + fileName))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static JSONObject reName(){
        JSONObject user = getJSONObject("reqres.json");
        user.put("name", "Tomato");
        user.put("job", "Eat maket");
        return user;
    }
}
