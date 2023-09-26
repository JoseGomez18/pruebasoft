package com.co.senasoft.stepsdefinitions;

import com.co.senasoft.tasks.Register;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("he user enter to the web page")
    public void heUserEnterToTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.koaj.co/"));
    }
    @When("he user enter the credentials")
    public void heUserEnterTheCredentials() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.enter());
        Thread.sleep(4000);
    }
    @Then("he user could see his succesful register")
    public void heUserCouldSeeHisSuccesfulRegister() {

    }

}
