package runners;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html"},
        features = "src/test/resources/FeatureFiles",
        glue = "steps",
        tags = {"@Search-Cars"}        
        )

public class PositiveTestSuite   {
	
	
}


