package co.com.choucair.certification.retotecnicov2.tasks;

import co.com.choucair.certification.retotecnicov2.UtestData;
import co.com.choucair.certification.retotecnicov2.userinterface.FillOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.retotecnicov2.userinterface.FillOutPage.*;

public class FillOut implements Task {

    private UtestData utestData;

    public FillOut(UtestData utestData) {
        this.utestData = utestData;
    }
    public static FillOut thePersonalDate(UtestData utestData) {

        return Tasks.instrumented(FillOut.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_JOIN),
                Enter.theValue(utestData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getSrtMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(utestData.getSrtDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(utestData.getSrtYear()).from(SELECT_YEAR)
                );


    }
}
