package stepDef;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class LoginStep extends setup {

    loginPage lp = new loginPage(driver);


    @Given("I am at TalentTEK homepage")
    public void iAmAtTalentTEKHomepage() {
     lp.verifyHomepageTitle();
        
    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        lp.enterEmailAddress(Hook.existingStudentEmail);

    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        lp.enterPassword(Hook.existingStudentPassword);

    }

    @When("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        lp.clickLoginButton();

    }

    @Then("I should be able to successfully log in")
    public void iShouldBeAbleToSuccessfullyLogIn() {
    }
}
