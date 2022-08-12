package com.toolsqa.stepdefinitions;

import com.toolsqa.interactions.OpenBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenPageStepDefinitions {

    @Before
    public void prepareActor(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("I open the browser and go to the toolsqa page")
    public void iOpenTheBrowserAndGoToTheToolsqaPage() throws InterruptedException {
        OnStage.theActorCalled("actor").wasAbleTo(OpenBrowser.on());
        Thread.sleep(5000);
    }

    @When("I close the alert in the page")
    public void iCloseTheAlertInThePage() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("I see that it is the correct page")
    public void iSeeThatItIsTheCorrectPage() {
        throw new io.cucumber.java.PendingException();
    }

}
