package seleniumProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class HandlingFrames extends Base {
	
	public void handleFrames() {
	driver.navigate().to("https://demoqa.com/frames");
		//printing all available frames
	List<WebElement> totalframes=driver.findElements(By.tagName("iframe")); // list of web elements
	System.out.println(totalframes);
	System.out.println(totalframes.size());
	
	driver.switchTo().frame(1);// by index
    //driver.switchTo().frame("frame1");// name attribute is deleted in the dom, due to update . this is for reference
	driver.switchTo().parentFrame();
	WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	driver.switchTo().frame(iframe1);// web element frames
	WebElement iframeheading= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(iframeheading.getText());
	
	
	driver.switchTo().defaultContent();// focus will moved to default content.This driver focused on the top window/first frame.
	}
	
	//switchTo() method is used to change the focus of the driver from element to another in the same page of the application
   // frames(int index)- to move the pointer to the nth frame
  // frames(String nameOrld)- to specific name attribute
 //frames(String nameOrld)
 //parentFrame()-switch the focus from the current location to the first parent iframe 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames = new HandlingFrames();
		frames.browserInitializer();
		frames.handleFrames();
	}

}
