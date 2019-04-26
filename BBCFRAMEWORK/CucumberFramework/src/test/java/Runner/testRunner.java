package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\jahed.miah\\BBCFRAMEWORK\\CucumberFramework\\src\\test\\java\\featureFiles",
glue = { "stepsDefination" }
, tags = {"@JahedRandomTest"}
)
public class testRunner {

}
