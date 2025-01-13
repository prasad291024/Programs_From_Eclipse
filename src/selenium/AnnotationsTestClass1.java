package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestClass1 {

	@AfterClass
	public void afterClass() {
		System.out.println("This is after class 6");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method 4 ");
	}

	@Test
	public void Test_cases1() {
		System.out.println("This is actual method (test case)");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method 5 ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is after test 7");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class 3");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite 8 ");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite 1");
	}

	@Test
	public void Test_cases2() {
		System.out.println("This is actual method (test case)");
	}
}
