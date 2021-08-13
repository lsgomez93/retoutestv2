package co.com.choucair.certification.retotecnicov2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InserTheSecurityPage {

    public static final Target BUTTON_FORM_SECURITY = Target.the("Button get form the devices").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("were we write the password")
            .located(By.id("password"));
    public static final Target CONFIRM_INPUT_PASSWORD = Target.the("were we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("were we accept information")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/input"));
    public static final Target CHECK_TERMS_USE = Target.the("were we accept terms use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACITY = Target.the("were we accept privacity and security")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_SEND = Target.the("Button completed to registre").
            located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target MESSAGE_WELCOME = Target.the("Button get form the devices").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));




}
