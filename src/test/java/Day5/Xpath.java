package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Xpath {

	WebDriver driver;

	@BeforeSuite
	public void setupBrowser() {
		driver = new ChromeDriver();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();

	}

	@Test
	public void test001() {
		String url = "http://52.9.182.211:3001/v1/log-in";
		openMainPage(url);
		usingLastFunction();
		usingPositionFunction();

	}

	private void usingPositionFunction() {
		driver.findElement(By.xpath("(//input[@type='text'])[position()=2]")).sendKeys(" email@test.com");

	}

	private void usingLastFunction() {
		driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("email@test.com");

	}

	private void openMainPage(String url) {
		driver.get(url);

	}

}
