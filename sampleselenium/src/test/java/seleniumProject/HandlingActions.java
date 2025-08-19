package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	// simulate the right click
	public void verifyRightClick() {
		WebElement rightClick=driver.findElement(By.xpath("//a[text()='Home']"));
		Actions act=new Actions(driver);//creating object for aActions class
		
		// contextClick - method to simulate the right click 
		//contextClick(rightClick)-- passing the web element to method
		// build()- to prepare the driver to perform the actions
		//perform()-to execute the action
		act.contextClick(rightClick).build().perform();
	}
	
	public void verifyMouseHover() {
  WebElement mouseHover=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
    Actions action=new Actions(driver);
    action.moveToElement(mouseHover).build().perform();// moveToElement - method to simulate mouse hover action
		
	}

	 public void verifyDragDrop()
	{
	driver.navigate().to("https://demoqa.com/droppable");
	WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
	Actions action=new Actions(driver);
	action.dragAndDrop(drag,drop).build().perform();
	}
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions=new HandlingActions();
		actions.browserInitializer();
	//	actions.verifyRightClick();
		//actions.verifyMouseHover();
		actions.verifyDragDrop();
	}

}
