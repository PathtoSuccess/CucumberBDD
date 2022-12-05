package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features//search.feature"},
		glue="stepDefinition",		
		plugin= {
				"pretty","html:Report/myreport.html",
				"json:Report/myreport.json"
		},
		dryRun=false,
		monochrome=true,
		tags = "@sanity"
		)

public class TestRunner {

}
