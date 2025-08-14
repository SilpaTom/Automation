package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void VerifyCommands() { //Details of "Single Input Field" section
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	//driver is object which is user defined
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='single-input-field']")); //locate textBox
		textBox.sendKeys("Hello World"); //to enter data to the text box
		WebElement button = driver.findElement(By.xpath("//button[@id='button-one']")); //locate the button
		button.click(); //to click the "Show Message" button
		WebElement textMessage = driver.findElement(By.xpath("//div[@id='message-one']")); //locate the text message printed on web page
		System.out.println(textMessage.getText()); //to print the text of textMessage element in Console window
		System.out.println(textMessage.getTagName()); // to print the tag name of textMessage element
		System.out.println(textMessage.getAttribute("id")); // to print the value of 'id' attribute of textMessage element. NOT USED CURRENTLY
		System.out.println(textMessage.getCssValue("background")); //to get the css values of web element
		textBox.clear(); //to clear the values in textBox
	}
	
	public void VerifyCommands2() {
		
	}
	
	public static void main(String[] args) {
		WebElementCommands web = new WebElementCommands();
		web.browserInitializer();
		web.VerifyCommands();
		web.VerifyCommands2();
	}

}
