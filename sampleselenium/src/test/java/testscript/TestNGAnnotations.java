package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@Test
	public void testCase() {
		System.out.println("testCase");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
	}




}
