package Day2.pages;

public class BasePage extends TestBase {
	
	public BasePage() {
		super();
	}
	
	public HomePage goToHomePage() {
		driver.get("https://www.yahoo.com/");
		return new HomePage();
	}

}
