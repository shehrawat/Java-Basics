package loginfunctionality;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class SignUp
{


	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test Annotation");

	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method Annotation");

	}
	
	
	@Test(priority=-1, dataProvider="getExcelData")
	public void testMethod1(Integer a, Integer b, Integer c)
	{
		System.out.println("Test Annotation1");
		
	}
	
	@Test(priority=1)
	public void testMethod2()
	{
		System.out.println("Test Annotation2");
		
	}
		
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method Annotation");

	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test Annotation");

	}

	
	
	
	@DataProvider
	public Object[][] getExcelData()
	{
		return new Object[][]{{1,2,3},{3,4,5}};
		
	}



}
