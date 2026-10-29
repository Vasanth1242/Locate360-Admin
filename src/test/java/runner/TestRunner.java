package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings({ "deprecation" })
@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/java/features", glue = { "stepDefinitions", "com.hooks" }, plugin = { "pretty", "summary",
				"html:target-reports.html"} 
				 
		, tags = "@Management1"

)

public class TestRunner {

}
