package com.capgemini.apitesting.week3.parallel;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class ParallelGetRequestsTest {

    @Test
    public void testGetUsers() {
        RestAssured
            .given()
            .baseUri("https://reqres.in/api")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200);
        System.out.println("GetUsers executed by Thread: " + Thread.currentThread().getName());
    }

    @Test
    public void testGetPosts() {
        RestAssured
            .given()
            .baseUri("https://jsonplaceholder.typicode.com")
        .when()
            .get("/posts")
        .then()
            .statusCode(200);
        System.out.println("GetPosts executed by Thread: " + Thread.currentThread().getName());
    }
}