package testNGExamples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Example511march {

	@BeforeSuite
	public void runBeforeSuite() {
		System.out.println("**************Before Suite***************************");
	}
	
	@AfterSuite
	public void runAfterSuite() {
		System.out.println("**************After Suite***************************");
}
}