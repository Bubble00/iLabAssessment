package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests",
        glue = {"stepDefinition"},
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true,
        strict = true
)
public class TestRunner {
}
