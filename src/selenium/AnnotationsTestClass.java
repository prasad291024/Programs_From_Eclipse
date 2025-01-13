package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTestClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite 1");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test 2");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class 3");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method 4 ");
	}

	@Test
	public void Test_cases() {
		System.out.println("This is actual method (test case)");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method 5 ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after class 6");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is after test 7");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite 8 ");
	}

}
