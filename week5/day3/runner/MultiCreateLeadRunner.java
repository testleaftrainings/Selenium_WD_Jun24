package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/MultiCreateLead.feature"},glue="stepDef",
				publish = true,
				monochrome = true)
public class MultiCreateLeadRunner extends AbstractTestNGCucumberTests{

}
