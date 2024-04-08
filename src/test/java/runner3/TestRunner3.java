package runner3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"C:\\Users\\shiva\\Documents\\workspace-sts\\Project2\\src\\test\\resources\\Checkform2\\checkform2.feature"},
		glue = "stepdefinition3"
			
			)
public class TestRunner3 extends AbstractTestNGCucumberTests{
	
	
	

}
