package Day2;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	WebDriver driver;

	@BeforeSuite
	public void setupBrowser() {
		driver = new ChromeDriver();
	}

	@Test
	public void testYahooSearch() {

		openMainPage();
		typeQuery();
		submitSearch();
		waitForResultsPage();
		assertResultPage();
	}

	private void waitForResultsPage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='web']")));
	}

	public void assertResultPage() {
		WebElement searchResult = driver.findElement(By.xpath("//div[@id='web']"));
		boolean isResultsDisplayed = searchResult.isDisplayed();
		assertTrue(isResultsDisplayed);
	}

	public void submitSearch() {
		driver.findElement(By.id("uh-search-button")).click();
	}

	public void typeQuery() {
		driver.findElement(By.id("uh-search-box")).sendKeys("Portnov Computer School");

	}

	public void openMainPage() {
		driver.get("https://www.yahoo.com/");
	}

}
