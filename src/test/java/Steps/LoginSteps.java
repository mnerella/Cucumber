package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @Given("^I navigate to Login page$")
    public void iNavigateToLoginPage() {

        System.out.println("Login page should open");

    }

    @And("^I enter username as admin and password as admin$")
    public void iEnterUsernameAsAdminAndPasswordAsAdmin() {

        System.out.println("should able to enter username and password");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {

        System.out.println("Should able to click login button");

    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {

        System.out.println("Should be able to navigate to userform page");
    }
}
