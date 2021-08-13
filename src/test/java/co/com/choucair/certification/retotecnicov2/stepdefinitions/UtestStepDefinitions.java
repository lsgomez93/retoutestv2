package co.com.choucair.certification.retotecnicov2.stepdefinitions;

import co.com.choucair.certification.retotecnicov2.UtestData;
import co.com.choucair.certification.retotecnicov2.question.Answer;
import co.com.choucair.certification.retotecnicov2.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }
    @Given("^than Leidy wants registre page utest$")
    public void thanLeidyWantsRegistrePageUtest() {
        theActorCalled("Leidy").wasAbleTo(OpenUpUtest.onThe());
    }
    @When("^she fillout date of the form and send$")
    public void sheFilloutDateOfTheFormAndSend(List<UtestData> utestData) {
        theActorInTheSpotlight().attemptsTo(
                FillOut.thePersonalDate(utestData.get(0)),
                Registre.theLocationInformation(utestData.get(0)),
                EnterThe.informationDevices(utestData.get(0)),
                InsertThe.securityInformation(utestData.get(0))
        );
    }
    @Then("^she receives a mesagge de bienvenida a pagina Utest(.*)$")
    public void sheReceivesAMesaggeDeBienvenidaAPaginaUtest(String question) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(question)));
    }
}
