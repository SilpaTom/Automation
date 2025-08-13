package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Example extends Base{
	public void Locate() {
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
	//	WebElement element2 = driver.findElement(By.xpath("//input[@id='value-a']"));	)
	}

	public static void main(String[] args) {
		Example eg = new Example();
		eg.browserInitializer();

	}

}
