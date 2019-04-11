package loginfunctionality;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuiteBase
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite Annotation");

	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite Annotation");

	}
}
