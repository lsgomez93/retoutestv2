package co.com.choucair.certification.retotecnicov2.tasks;

import co.com.choucair.certification.retotecnicov2.userinterface.UpUtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpUtest implements Task {
    private UpUtestPage upUtestPage;
    public static OpenUpUtest onThe() {

        return Tasks.instrumented(OpenUpUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(upUtestPage));

    }
}
