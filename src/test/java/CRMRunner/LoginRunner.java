package CRMRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features ="src//test//resorces//CRMFeatures.CRMLogin.feature",
		glue= {"CRMstepDef"},
		monochrome=true	
		)

public class LoginRunner {

}
