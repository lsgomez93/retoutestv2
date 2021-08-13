package co.com.choucair.certification.retotecnicov2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

;

public class FillOutPage {

    public static final Target BUTTON_JOIN = Target.the("button get form registre")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRST_NAME = Target.the("were we write the first name ")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("were we write the last name ")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("were we write the email ")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("were we select month birthday ")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("were we select day birthday ")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("were we select year birthday ")
            .located(By.id("birthYear"));


}
