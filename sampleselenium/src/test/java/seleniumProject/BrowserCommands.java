package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	public WebDriver driver;
	
	public void browserInitializer() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();   //to maximize the window
		//driver.manage().window().minimize(); //to minimize the window
	}
	
	public void browserCommands() {
		String title = driver.getTitle();	//to get the Title of opened page to variable "title"
		System.out.println(title);          // to print the title in Console
		String url = driver.getCurrentUrl();// to get the current url of opened page
		System.out.println(url);            // to print the url in Console
		String pagesource = driver.getPageSource();// to get the page source of opened page
		System.out.println(pagesource);    // to print the page source of opened page
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);  //
	}

	public static void main(String[] args) {
		BrowserCommands browser = new BrowserCommands(); // object of the browserInitializer class is created
		browser.browserInitializer(); //calling methods using class objects
		browser.browserCommands();    //calling methods using class objects
	}

}
