package Day2.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;

	public TestBase() {
		PageFactory.initElements(driver, this);
	}

	@BeforeTest
	public void setupBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterTest()
	public void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
	}

}
