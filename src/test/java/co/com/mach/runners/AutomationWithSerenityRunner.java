package co.com.mach.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/login/login.feature"},
        glue = {"co.com.mach.stepdefinitions"},
        tags = "@CorrectLogin"

)

public class AutomationWithSerenityRunner {
}
