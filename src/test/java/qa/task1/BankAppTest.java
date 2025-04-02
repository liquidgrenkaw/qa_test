package qa.task1;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class BankAppTest {
    @Test
    void getResponse() {
        given()
                .baseUri("http://localhost:9999/")
                .when()
                .get("api/v1/demo/accounts")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("", hasSize(3))
                .body("[1].balance", greaterThanOrEqualTo(0));
//                .body("every { it.balance >= 0", is(true));
    }

//    @Test
//    void jsonSchemaValidator() {
//        given()
//                .baseUri("http://localhost:9999/")
//                .when()
//                .get("api/v1/demo/accounts")
//                .then()
//                .body(matchesJsonSchemaInClasspath())
//    }
}
