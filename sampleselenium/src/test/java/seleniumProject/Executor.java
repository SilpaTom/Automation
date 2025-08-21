package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Executor extends Base{
	
	// driver interfecae does not have capacity to handle js directly. type casted to  js interface 
	public void verifyJavascriptExecutor() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
	//	js.executeScript("window.scrollBy(0,100)", ""); // scrollBy is relative scrolling. from the current point to next.. 200pxl/100 down from top
  //   js.executeScript("window.scrollBy(100,200)", "");		
		//js.executeScript("window.scrollBy(200,300)", "");
		//js.executeScript("window.scrollTo(0,0)", "");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");// document.body.scrollHeight to get height of the web page
		//js.executeScript("window.scrollTo(200,300)", ""); //scrollTo: ABSOLUTE SCROLLING. 
		System.out.println(js.executeScript("return window.pageYOffset"));
		//scrollBy() uses the current scroll position as its reference.
		//scrollTo() uses the absolute top-left corner of the document as its reference.
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executor executor= new Executor();
		executor.browserInitializer();
		executor.verifyJavascriptExecutor();
	}

}
