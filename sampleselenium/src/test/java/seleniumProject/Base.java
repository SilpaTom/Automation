package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver; //driver is the object of the interface "WebDriver"
	
	public void browserInitializer() { //user defined method is created
		driver = new ChromeDriver(); //call implemented class Chrome (Chrome is the class)
		//driver = new EdgeDriver(); //call implemented class Edge driver if you are running code in Edge
		//driver = new FirefoxDriver(); // if your class is Firefox
		
		driver.get("https://selenium.qabible.in/index.php"); // the link to test the given site is given in driver.get
		driver.manage().window().maximize(); // to get Chrome in full screen

	}
	public void quitAndClose() { // for automatically close and quit the browser, we call this method
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		Base base = new Base(); // object base is created for Base class
		base.browserInitializer(); //method browserInitializer is called
		base.quitAndClose();  //method quitAndClose is called
	}

}
