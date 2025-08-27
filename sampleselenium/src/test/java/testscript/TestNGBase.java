package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod; 

public class TestNGBase {
	public WebDriver driver; //driver is the object of the interface "WebDriver"
	
	@BeforeMethod // before executing each test case
	public void browserInitializer() 
	{ 
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/"); 
		driver.manage().window().maximize(); 

	}
	@AfterMethod // after execution of each method
	public void quitAndClose() 
	{ 
		driver.close();
		
	}

	
}
