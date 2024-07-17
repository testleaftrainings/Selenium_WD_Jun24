package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethod;


@CucumberOptions(//features = {"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"},
				features ="src/test/java/features",
				glue={"stepDef"},
				publish = true,
				monochrome = true,
				tags = "@positive or @negative")
public class LoginRunner extends ProjectSpecificMethod{

}
