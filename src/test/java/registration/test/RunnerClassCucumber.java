package registration.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// runner class for cucumber
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources", strict = true, dryRun = false)
public class RunnerClassCucumber {

}
