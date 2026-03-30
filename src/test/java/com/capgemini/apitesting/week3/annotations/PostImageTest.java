package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PostImageTest {

    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }

    @Test
    public void testUploadImage() {
        RestAssured
            .given()
            .multiPart("file", "sample.png")
        .when()
            .post("/pet/1/uploadImage")
        .then()
            .statusCode(200);
    }
}