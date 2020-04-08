package com.la.TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "./features/",
					glue= {"com.la.stepDef"},
					//tags= {"@TestngTest"},
					//plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"}
					//monochrome = true
					dryRun = false
		)
public class TestRunner {


	/*
	private TestNGCucumberRunner testNGCucumberRunner;
	

	@BeforeClass(alwaysRun =true)
	
	public void setUpCass()
	
	{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
			
		}
	
	@Test(dataProvider="features")
	
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		
		
		
	}
	
	
	@DataProvider
	public Object[][] features()
	
	{
		return testNGCucumberRunner.provideFeatures();
		
		
	}
	
	@AfterClass(alwaysRun = true)
	
	public void tearDown() {
		
		testNGCucumberRunner.finish();
		
	}*/
}



















