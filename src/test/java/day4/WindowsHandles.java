package day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WindowsHandles {
	WebDriver driver;

	@BeforeSuite
	public void setupBrowser() {
		driver = new ChromeDriver();
	}

	@Test
	public void test001() {
		String url = "http://the-internet.herokuapp.com/windows";

		openMainPage(url);
		clickOnTheLink("Click Here");
		explicitWindowWait(2);
		assertTwoWindows();
		switchToNewWindow();
		assertTextOnPage();
	}

	private void explicitWindowWait(int WinNumber) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(WinNumber));
	}

	private void assertTextOnPage() {
		Assert.assertTrue(driver.getPageSource().contains("New Window"));
	}

	private void switchToNewWindow() {
		Object[] array = driver.getWindowHandles().toArray();
		String windowHandle1 = (String) array[1];
		driver.switchTo().window(windowHandle1);
		String actualWindowTitle = driver.getTitle();
		String expectedWindowTitle = "New Window";
		Assert.assertEquals(actualWindowTitle, expectedWindowTitle);
	}

	private void assertTwoWindows() {
		Set<String> windowsHandles = driver.getWindowHandles();
		int size = windowsHandles.size();
		int expectedsize = 2;
		Assert.assertEquals(size, expectedsize);
	}

	private void clickOnTheLink(String linkText) {
		WebElement element = driver.findElement(By.partialLinkText(linkText));
		element.click();
	}

	private void openMainPage(String url) {
		driver.get(url);
	}
}
