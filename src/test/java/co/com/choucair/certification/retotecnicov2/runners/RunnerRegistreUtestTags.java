package co.com.choucair.certification.retotecnicov2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/uTest.feature",
        tags = "@registreUtest",
        glue = "co.com.choucair.certification.retotecnicov2.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerRegistreUtestTags {
}
