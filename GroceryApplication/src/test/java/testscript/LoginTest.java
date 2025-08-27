package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.TestNGBase;

public class LoginTest extends TestNGBase{
	
	@Test
	public void verifyLoginWithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
	}
	
	@Test
	public void verifyLoginWithValidUsernameInvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
	}
	
	@Test
	
	public void verifyLoginWithInvalidUsernameValidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
	}
	@Test
	public void verifyLoginWithInvalidUsernameInvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(4, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "LoginPage");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginBtn.click();
	}
}
