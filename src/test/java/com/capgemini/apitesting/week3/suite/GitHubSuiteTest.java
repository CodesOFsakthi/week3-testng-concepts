package com.capgemini.apitesting.week3.suite;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GitHubSuiteTest {

    @Test
    public void testGetRepos() {
        RestAssured
            .given()
            .baseUri("https://api.github.com")
        .when()
            .get("/users/octocat/repos")
        .then()
            .statusCode(200);
    }

    @Test
    public void testCreateRepoUnauthorized() {
        RestAssured
            .given()
            .baseUri("https://api.github.com")
            .body("{\"name\":\"test-repo\"}")
            .contentType("application/json")
        .when()
            .post("/user/repos")
        .then()
            .statusCode(401); // Unauthorized without token
    }
}