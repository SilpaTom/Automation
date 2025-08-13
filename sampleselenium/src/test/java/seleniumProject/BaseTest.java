package seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
		
		public void BrowserIn() {
			driver = new ChromeDriver();
			driver.get("https://chatgpt.com/?utm_source=google&utm_medium=paidsearch_brand&utm_campaign=GOOG_C_SEM_GBR_Core_CHT_BAU_ACQ_PER_MIX_ALL_APAC_IN_EN_032525&utm_term=chatgpt&utm_content=177344203135&utm_ad=741704613486&utm_match=e&gad_source=1&gad_campaignid=22370388714&gclid=Cj0KCQjw18bEBhCBARIsAKuAFEa75kYgJAPbyfLYFbwYeaJ9_iPhr5pVKisu8UMBcrHlIDwSeSGHhJkaApaeEALw_wcB");	
			driver.manage().window().maximize();
		}
		public void commands() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		public void quit() {
			driver.quit();
			driver.close();
		}

	public static void main(String[] args) {
		BaseTest driver = new BaseTest();
		driver.BrowserIn();
		driver.commands();
		driver.quit();

	}

}
