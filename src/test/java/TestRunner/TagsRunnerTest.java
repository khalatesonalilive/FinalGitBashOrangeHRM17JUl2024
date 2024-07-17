package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features= {"AllFeaturesFile/Tags.feature"},
		glue= {"StepDefinationLayer/TagsSteps"},
		dryRun=true,
		monochrome=true,
		plugin= {
			"html:Reports/abc1.html",
			"json:Reports/abc2.json",
			"junit:Reports/abc3.xml",
			"pretty:Reports/abc4.txt"
				
		},
		tags="@Regression"
		
		
		)


public class TagsRunnerTest {

}
