package co.com.choucair.certification.retotecnicov2.tasks;

import co.com.choucair.certification.retotecnicov2.UtestData;
import co.com.choucair.certification.retotecnicov2.userinterface.RegistreLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retotecnicov2.userinterface.RegistreLocationPage.*;

public class Registre implements Task {

    private UtestData utestData;

    public Registre(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Registre theLocationInformation(UtestData utestData) {

        return Tasks.instrumented(Registre.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_SEND_LOCATION),
                Enter.theValue(utestData.getSrtCity()).into(SELECT_CITY),
                Hit.the(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).into(SELECT_CITY),
                Enter.theValue(utestData.getSrtCodePostal()).into(INPUT_POSTAL_CODE),
                Click.on(SELECT_COUNTRY),
                Enter.theValue(utestData.getSrtCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY)

        );

    }
}
