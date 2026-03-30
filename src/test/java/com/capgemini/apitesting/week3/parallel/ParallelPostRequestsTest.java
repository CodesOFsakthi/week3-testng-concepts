package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class ParallelPostRequestsTest {

    @Test
    public void testCreateUser() {
        RestAssured
            .given()
            .baseUri("https://reqres.in/api")
            .body("{\"name\":\"Sakthi\",\"job\":\"student\"}")
            .contentType("application/json")
        .when()
            .post("/users")
        .then()
            .statusCode(201);
        System.out.println("CreateUser executed by Thread: " + Thread.currentThread().getName());
    }

    @Test
    public void testCreatePost() {
        RestAssured
            .given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .body("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}")
            .contentType("application/json")
        .when()
            .post("/posts")
        .then()
            .statusCode(201);
        System.out.println("CreatePost executed by Thread: " + Thread.currentThread().getName());
    }
}