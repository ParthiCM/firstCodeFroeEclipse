package TestRunnerPackage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\FeaturePackage\\bookMyShow.feature", //the path of the feature files
		glue={"StepDefinitionPackage"}, //the path of the step definition files
		format= {"pretty","html:Report"},
		dryRun = true,
		monochrome = true,
		tags = {"@RegressionTest"}
		//tags = {"@SmokeTest"}
		
		)

public class bookMyShow_TestRunner {

}
