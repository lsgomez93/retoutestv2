package co.com.choucair.certification.retotecnicov2.tasks;

import co.com.choucair.certification.retotecnicov2.UtestData;
import co.com.choucair.certification.retotecnicov2.userinterface.InserTheSecurityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retotecnicov2.userinterface.InserTheSecurityPage.*;

public class InsertThe implements Task {
    private UtestData utestData;

    public InsertThe(UtestData utestData) {
        this.utestData = utestData;
    }

    public static InsertThe securityInformation(UtestData utestData) {

        return Tasks.instrumented(InsertThe.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_FORM_SECURITY),
                Enter.theValue(utestData.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getConfirmPassword()).into(CONFIRM_INPUT_PASSWORD),
                Click.on(CHECK_STAY_INFORMED),
                Click.on(CHECK_TERMS_USE),
                Click.on(CHECK_PRIVACITY),
                Click.on(BUTTON_SEND)
        );

    }
}
