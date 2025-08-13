package seleniumProject;

public class NavigationCommands extends Base {
	public void navigation() {
		driver.navigate().to("https://www.amazon.in/");	//driver is object which is user defined
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

	public static void main(String[] args) {
		NavigationCommands nav = new NavigationCommands(); //object is created for class NavigationCommands
		nav.browserInitializer();
		nav.navigation();
	}

}
