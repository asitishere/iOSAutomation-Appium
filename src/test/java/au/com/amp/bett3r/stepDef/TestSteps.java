package au.com.amp.bett3r.stepDef;

import au.com.amp.bett3r.pages.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestSteps {
    @When("^As a customer I want to login to bett3r application$")
    public void customer_valid_login_to_application() throws Throwable {
        GetStartedPage.getStarted();
        TermsAndConditionsPage.termsAndConditions();
        SetYourPinPage.setThePin("3333");
        SetYourPinPage.verifyThePin("3333");
        AMPLoginPage.loginToAMPApp("luskin1", "Password1");

    }

    @Then("^after successful login customer can see Bett3r account details$")
    public void after_successful_login_customer_land_on_application_Dashboard_page() throws Throwable {
        Assert.assertTrue(HomePage.getBett3rAccountDetails().contains("Pay"));
        Assert.assertTrue(HomePage.getBett3rAccountDetails().contains("Spend"));
        Assert.assertTrue(HomePage.getBett3rAccountDetails().contains("Save"));
    }
}
