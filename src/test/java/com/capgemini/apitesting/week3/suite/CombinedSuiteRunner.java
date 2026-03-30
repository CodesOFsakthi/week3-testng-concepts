package com.capgemini.apitesting.week3.suite;

import org.testng.annotations.Test;

public class CombinedSuiteRunner {

    @Test
    public void runPetStoreSuite() {
        System.out.println("Running PetStore Suite...");
    }

    @Test
    public void runDummyApiSuite() {
        System.out.println("Running DummyAPI Suite...");
    }

    @Test
    public void runGitHubSuite() {
        System.out.println("Running GitHub Suite...");
    }

    @Test
    public void runAutomationExerciseSuite() {
        System.out.println("Running AutomationExercise Suite...");
    }
}