package acceptance_package;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "use_cases", 
		monochrome = false,
        snippets = SnippetType.CAMELCASE,
        glue = {"acceptance_package"},
        dryRun = false)

public class Acceptance {
	
}
