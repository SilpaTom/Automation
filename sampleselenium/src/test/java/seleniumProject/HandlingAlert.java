package seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// there are 3 types of alert
// simple. only click ok
// conditional = ok and cancel
//prompt = need to input some data and then ok or cancel
public class HandlingAlert extends Base{
	
	public void VerifySimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme1_button= driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme1_button.click();
		Alert simplealert=driver.switchTo().alert(); // Alert interface
		System.out.println(simplealert.getText());
		simplealert.accept();//to click the ok button in the alert meassage
		
	}
	
	// confirm alert
	public void VerifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme2_button= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickme2_button.click();
		Alert confirmalert=driver.switchTo().alert(); 
		//confirmalert.accept();
		confirmalert.dismiss();// to click the cancel button in alert
	}

	//	// prompt alert
	public void verifyPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme3_button= driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickme3_button.click();
		Alert promptalert=driver.switchTo().alert(); 
		promptalert.sendKeys("silpa");
		promptalert.accept();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				HandlingAlert alert=new HandlingAlert();
		alert.browserInitializer();
	//	alert.VerifySimpleAlert();
		//alert.VerifyConfirmAlert();
		alert.verifyPromptAlert();

	}

}
