package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"usage", "html:target/cucumber-html","json:target/cucumber-json/cucumber.json"},
		features = {"classpath:features"},
		glue = {"classpath:stepDefinitions"}
)
public class TestRunner {

}
