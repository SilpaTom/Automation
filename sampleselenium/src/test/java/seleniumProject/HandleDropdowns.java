package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdowns extends Base {
	
	//for dropdown
	public void verifyDropdowns() { 
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(drop); 
		//Select is a predefined class. 
		                                  //select is the object. 
		//now Select is available near the webelement and hence drop value is passed to select the element of object
		
		select.selectByIndex(1); //to select the second option in the dropdown, we give index 1
		select.selectByValue("python"); //By Value Attribute. selectbyvalue is an inbuilt function to select the value python in the dropdown 
		select.selectByVisibleText("SQL"); //to select value SQL based on visible text displayed on dropdown option		
	}
	
	//for check box
	public void verifyCheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check = driver.findElement(By.xpath("//input[@value='option-1']")); //to tick option1, its value is given
		check.click();
		WebElement check3 =driver.findElement(By.xpath("//input[@value='option-3']")); //locate third value in checkbox
		
		if (check3.isSelected()) //to check whether the check3(option3) is selected or not
		{
			check3.click();
		}
		System.out.println(check3.isDisplayed());  //to check whether option3 is displayed/present in UI or not
		System.out.println(check3.isEnabled());    //to check whether option3 is in enabled state (clickable)/grayed out or not		
	}
	
	
	//for radio buttons
	public void verifyRadiobutton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='blue']"));
		radio1.click();
		System.out.println(radio1.isDisplayed());  //Returns true if the radio button is visible on the web page.
		System.out.println(radio1.isEnabled()); //Returns true if the radio button is enabled and clickable.
		System.out.println(radio1.isSelected());//Returns true if the radio button is currently selected (checked).
		
		//to count iframes in webpage (eg: youtube ad), a list of elements needs to be used. findElements is used to retrieve this list of elements.
		//an empty list is retrieved in findElements if no elements matching the condition is present; instead of showing exceptions and stopping the execution midway.
		
	}

	public static void main(String[] args) {
		HandleDropdowns dropdown = new HandleDropdowns();
		dropdown.browserInitializer();
		//dropdown.verifyDropdowns();
		//dropdown.verifyCheckbox();
		dropdown.verifyRadiobutton();
	}

}
