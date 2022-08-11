package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/login/login.feature"},
glue= {"StepDefinition"},plugin = {"html:Result/TestNG.html"})

public class Testngrunner extends AbstractTestNGCucumberTests {

}
