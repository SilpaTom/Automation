package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locate() {
		//WebElement is the interface in Selenium that represents an HTML element on a web page. 
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");	//driver is object which is user defined 		
		WebElement id = driver.findElement(By.id("single-input-field")); //WebElement is a class to locate the object id using findElement method
		WebElement element1 = driver.findElement(By.className("my-2")); //Located the control using class name 
		WebElement element2 = driver.findElement(By.name("viewport")); //Located the control using name
		WebElement element3 = driver.findElement(By.linkText("Ajax Form Submit")); //Located the control using link text
		WebElement element4 = driver.findElement(By.partialLinkText("Ajax Form"));  //Located the control using partial link text
		WebElement element5 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/label")); //Located the control using Absolute XPath which is not recommended usually
		WebElement element6 = driver.findElement(By.xpath("//input[@id='single-input-field']")); //Located label control using relative XPath by attribute
		WebElement element7 = driver.findElement(By.xpath("//button[text()='Show Message']")); // Located the button control using relative XPath by text method
		
		//Method by CSS Selectors Combination
		
		WebElement element8 = driver.findElement(By.cssSelector("input#single-input-field")); //CSS Selector Combination of Tag and ID.
		WebElement element9 = driver.findElement(By.cssSelector("input.form-control")); //Tag & Class combination. Not unique in this example. Hence do not use.
		WebElement element10 = driver.findElement(By.cssSelector("meta[name=viewport]")); //Tag & Name combination. Unique in this example. Hence if above co
		
		//Method by Combination of and or
		WebElement element11 = driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		WebElement element12 = driver.findElement(By.xpath("//button[@type='button' or @id='button-one']"));//situation- button toggling with two texts 
		
		//XPath Access Methods
		WebElement element13 = driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']")); //Identify the parent as "Parent of Child"
		WebElement element14 = driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); //Identify the child as "Child of Parent"
		
		WebElement element15 = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']")); //Identify the following node
		WebElement element16 = driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']")); //Identify the preceding node
		WebElement element17 = driver.findElement(By.xpath("//div/ancestor::div[@class='card']")); //Identify the node from ancestor - eg: You are the granddaughter of ABC
		WebElement element18= driver.findElement(By.xpath("//div[@class='card']//descendant::div")); //Identify the node from descendant eg: You are the grandmother of ABC
		
		
	}

	public static void main(String[] args) {
		Locators browse = new Locators(); //object is created for class Locators
		browse.browserInitializer();
		browse.locate();

	}

}
