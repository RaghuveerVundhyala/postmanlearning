package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature_FreeCRM"
		,glue={"stepDefFreeCRM"}
		//,tags={"@first_name_field_valifation"}
		)
public class Testrunner {

}
