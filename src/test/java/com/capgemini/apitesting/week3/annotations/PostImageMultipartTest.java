package com.capgemini.apitesting.week3.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PostImageMultipartTest {

    @Test
    public void testUploadImageMultipart() {
        RestAssured
            .given()
            .multiPart("file", "sample.png")
        .when()
            .post("https://petstore.swagger.io/v2/pet/2/uploadImage")
        .then()
            .statusCode(200);
    }

    @AfterMethod
    public void teardown() {
        System.out.println("Test completed, resources cleaned up.");
    }
}