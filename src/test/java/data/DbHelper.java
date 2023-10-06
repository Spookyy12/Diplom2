package data;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DbHelper {    private static final RequestSpecification request = new RequestSpecBuilder()
        .setBaseUri("http://localhost")
        .setPort(8080)
        .setAccept(ContentType.JSON)
        .setContentType(ContentType.JSON)
        .log(LogDetail.ALL)
        .build();


    public void sendRequestForApprovedCard(DataHelper.UserCardApproved card) {
        given()
                .spec(request)
                .body(card)
                .when()
                .post("/api/v1/pay")
                .then()
                .statusCode(200)
                .body("status", equalTo("APPROVED"));
    }

    public void sendRequestForApprovedCard(DataHelper.UserCardDeclined card) {
        given()
                .spec(request)
                .body(card)
                .when()
                .post("/api/v1/pay")
                .then()
                .statusCode(200)
                .body("status", equalTo("APPROVED"));
    }
}
