package seleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends Base {
	/// for each window there will be separate handle IDs
	
	public void handleMultipleWindows() {
	driver.navigate().to("https://demo.guru99.com/popup.php");
	String firstHandleId=	driver.getWindowHandle();
	WebElement handle1=driver.findElement(By.xpath("//a[text()='Click Here']"));
	handle1.click();
	Set<String> handleIds= driver.getWindowHandles(); // Handle id are unique, so we can use set
	System.out.println(handleIds);
	
	Iterator<String>values=handleIds.iterator();
	while(values.hasNext())
	{
		String current_id=values.next();
		if(!current_id.equals(firstHandleId))
		{
			driver.switchTo().window(current_id);
			WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']"));
			email_fld.sendKeys("abc@gmail.com");
			WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			submit_fld.click();
			driver.switchTo().defaultContent(); 
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingMultipleWindows multiple_windows=new HandlingMultipleWindows();
		multiple_windows.browserInitializer();
		multiple_windows.handleMultipleWindows();
	}

}
