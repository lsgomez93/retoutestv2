package co.com.choucair.certification.retotecnicov2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistreLocationPage {

    public static final Target BUTTON_SEND_LOCATION = Target.the("Button get form location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target SELECT_CITY = Target.the("were we select la city")
            .located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_POSTAL_CODE = Target.the("were we write postal code")
            .located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_COUNTRY = Target.the("were we select la country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("were we select the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

}

