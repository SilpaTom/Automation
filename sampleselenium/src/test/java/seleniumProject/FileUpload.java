package seleniumProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Action class and Robot class methods can be used

public class FileUpload extends Base{
	public void fileUploadUsingSendKeys() {
		
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement uploadbutton= driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		uploadbutton.sendKeys("C:\\Users\\Silpa\\git\\Automation\\sampleselenium\\src\\test\\resources\\Finalised Obsqura Document.pdf");
		WebElement clickherebox= driver.findElement(By.xpath("//input[@id='terms']"));
		clickherebox.click();
		WebElement submitbutton= driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submitbutton.click();		
	}
	
	// robot class to simulate keyboard action
	   //when we use robot class try catch in main method and throws in declaration
	public void fileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement upload = driver.findElement(By.id("pickfiles"));
		upload.click();
		StringSelection selection =  new StringSelection("C:\\Users\\Silpa\\git\\Automation\\sampleselenium\\src\\test\\resources\\Finalised Obsqura Document.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		//For handling the operating time and no error occur
		robot.delay(2500);
		robot.keyPress (KeyEvent.VK_ENTER);
		robot.keyRelease (KeyEvent.VK_ENTER);
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload file=new FileUpload();
          file.browserInitializer();
       //   file.fileUploadUsingSendKeys();
          //when we use robot class try catch in main method and throws in declaration
          try {
			file.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
