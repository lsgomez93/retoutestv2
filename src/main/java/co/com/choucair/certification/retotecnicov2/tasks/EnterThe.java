package co.com.choucair.certification.retotecnicov2.tasks;

import co.com.choucair.certification.retotecnicov2.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.retotecnicov2.userinterface.EnterTheDevicesPage.*;

public class EnterThe implements Task {

    private UtestData utestData;

    public EnterThe(UtestData utestData) {
        this.utestData = utestData;
    }

    public static EnterThe informationDevices(UtestData utestData) {

        return Tasks.instrumented(EnterThe.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_FORM_DEVICES),
                Click.on(SELECT_SYSTEM_OPERATING),
                Enter.theValue(utestData.getSrtOperatingSystem()).into(INPUT_SYSTEM_OPERATING),
                Hit.the(Keys.ENTER).into(INPUT_SYSTEM_OPERATING),
                Click.on(SELECT_VERSION_SYSTEM_OPERATING),
                Enter.theValue(utestData.getSrtVersionOperatingSystem()).into(INPUT_VERSION_SYSTEM_OPERATING),
                Hit.the(Keys.ENTER).into(INPUT_VERSION_SYSTEM_OPERATING),
                Click.on(SELECT_LANGUAGE_SYSTEM_OPERATING),
                Enter.theValue(utestData.getSrtLanguageOperatingSystem()).into(INPUT_LANGUAGE_SYSTEM_OPERATING),
                Hit.the(Keys.ENTER).into(INPUT_LANGUAGE_SYSTEM_OPERATING),
                Click.on(SELECT_BRAND_MOBILE),
                Enter.theValue(utestData.getStrBrandMobile()).into(INPUT_BRAND_MOBILE),
                Hit.the(Keys.ENTER).into(INPUT_BRAND_MOBILE),
                Click.on(SELECT_MODEL_MOBILE),
                Enter.theValue(utestData.getStrModelMobile()).into(INPUT_MODEL_MOBILE),
                Hit.the(Keys.ENTER).into(INPUT_MODEL_MOBILE),
                Click.on(SELECT_SYSTEM_OPERATING_MOBILE),
                Enter.theValue(utestData.getStrOperatingSystemMobile()).into(INPUT_SYSTEM_OPERATIN_GMOBILE),
                Hit.the(Keys.ENTER).into(INPUT_SYSTEM_OPERATIN_GMOBILE)
                );
    }
}
