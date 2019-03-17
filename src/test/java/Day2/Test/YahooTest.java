package Day2.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Day2.pages.BasePage;
import Day2.pages.HomePage;
import Day2.pages.SearchResultPage;
import Day2.pages.TestBase;

public class YahooTest extends TestBase {

	BasePage basePage;
	HomePage homePage;
	SearchResultPage searchResultPage;

	public YahooTest() {
		super();
	}

	@Test
	public void YahooSearchTest() {
		basePage = new BasePage();
		homePage = basePage.goToHomePage();
		searchResultPage = homePage.gotToSearchResultpage();
		Assert.assertTrue(searchResultPage.isSearchResultsDisplayed());
	}

}
