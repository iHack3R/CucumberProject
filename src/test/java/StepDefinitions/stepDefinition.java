package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
    @Given("User is on a landing home page")
    public void homePage() {
        System.out.println("Home page opens");
    }

    @When("User clicks on the login option and enters the valid username {string} and password {string}")
    public void pageLogin(String username, String password) {
        System.out.println("Login page opens with username: " + username + " and password: " + password);
    }

    @Then("User gets logged in")
    public void userAccount() {
        System.out.println("User account opens");
    }
}