package co.com.choucair.certification.retotecnicov2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EnterTheDevicesPage {

    public static final Target BUTTON_FORM_DEVICES = Target.the("Button get form the devices").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target SELECT_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_VERSION_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_LANGUAGE_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAGE_SYSTEM_OPERATING = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECT_BRAND_MOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target INPUT_BRAND_MOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODEL_MOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_MODEL_MOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_SYSTEM_OPERATING_MOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target INPUT_SYSTEM_OPERATIN_GMOBILE = Target.the("Select your operating system")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));


}
