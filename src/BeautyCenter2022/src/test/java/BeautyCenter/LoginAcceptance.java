

package BeautyCenter;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases" ,  monochrome=true,
          snippets = SnippetType.CAMELCASE,
          
          glue = {"BeuatyCenter"})


public class LoginAcceptance {
	

}
