package qa.task1;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GoRestTest {

    @Test
    void getUsers() {
        given()
                .baseUri("https://gorest.co.in/")
                .when()
                .get("/public-api/users")
                .then()
                .statusCode(200);
    }
}
