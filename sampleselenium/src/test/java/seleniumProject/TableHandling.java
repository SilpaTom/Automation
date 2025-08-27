package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	
	public void verifyTables() {
		
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table1= driver.findElement(By.xpath("//table[@id='dataTable']")); // to locate table
		System.out.println(table1.getText());//to print the entire table data in console
	//for a table rows and column will be inside the tbody tag
		WebElement row3= driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]")); // to locate row
		System.out.println("3rd row");
		System.out.println("/n"+row3.getText());// to print data in the row 3
		//table[@id='dataTable']/tbody/tr[3]/td[2]
		
		WebElement col2= driver.findElement(By.xpath("	//table[@id='dataTable']/tbody/tr[3]/td[2]")); // to locate 2nd column/cell of the 3rd row
		System.out.println("2nd col");
		System.out.println("/n"+col2.getText());// to print the 2nd column data
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling table=new TableHandling();
		table.browserInitializer();
		table.verifyTables();
	}

}
