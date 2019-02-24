package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3CheckBoxesTest {
	WebDriver driver;
	WebElement checkbox1;
	WebElement checkbox2;
	
	@BeforeSuite
	public void setupBrowser() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test001() {
		String url = "http://the-internet.herokuapp.com/checkboxes";
		driver.get(url);
		
		checkbox1 = driver.findElements(By.tagName("input")).get(0);
		checkbox2 = driver.findElements(By.tagName("input")).get(1);

		selectCheckbox(checkbox1);
		selectCheckbox(checkbox2);

	}
	
	public void selectCheckbox(WebElement element) {
		if(element.isSelected())
		{
			element.click();
			System.out.println("checkbox is unselected");
		}
		else
		{
			element.click();
			System.out.println("checkbox is selected");
		}
	}
	

}
