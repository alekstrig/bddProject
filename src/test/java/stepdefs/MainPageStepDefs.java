package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.MainPageSteps;




public class MainPageStepDefs {

    MainPageSteps mainPageSteps = new MainPageSteps();

    @Given("On the buttom of the page fill {string} field with invalid email \\(like tttt@ttt)")
    public void on_the_buttom_of_the_page_fill_field_with_invalid_email(String email) throws InterruptedException {
        mainPageSteps.checkSubscribeWithInvalidEmail("r2");
    }
    @When("Click on Subscribe button")
    public void click_on_button() throws InterruptedException {
        mainPageSteps.subscribeButtonClick();
    }
    @Then("Check that {string} appear")
    public void check_that_appear(String string) throws InterruptedException {
        mainPageSteps.verify();



    }

}
