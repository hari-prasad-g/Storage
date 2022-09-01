package com.mavn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest {

	@BeforeClass
	public void Sample1()
	{
		System.out.println("Before class");
	}
//	@DataProvider(name="data")
//	public Object[][] data()
//	{
//		return new Object[][] { {"thillai", "A"},{"THILLAI", "a"}};
//		
//	}
	
	
	@AfterClass
	public void Sample2()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void Sample3()
	{
	System.out.println("Before method");	
	}
	@AfterMethod
	public void Sample4()
	{
		System.out.println("After method");
	}
	//run based on annotatiON
	@Test (priority = 2)
	public void abc()
	{
	System.out.println("Test1");	
	}
	@Test (priority = 1)  
	public void xyz()
	{
	System.out.println("Test2");	
	}
	
	@Test(invocationCount = 2)
	public void efg()
	{
	System.out.println("Test");	
	}
	
//	@Test(dataProvider = "data")
//	public void ijk()
//	{
//	System.out.println("Test3");	
//	}

	 @BeforeSuite
	 public void  Sample5()
	 {
	System.out.println("Before Suite");
	 }
     @AfterSuite
     public void sample6()
     {
    	 System.out.println("After Suite");
     }
     @BeforeTest
     public void sample7() {
    	 System.out.println("Before Test");
     }
     @AfterTest
     public void Sample8() {
    	 System.out.println("After Test");
     }
}

