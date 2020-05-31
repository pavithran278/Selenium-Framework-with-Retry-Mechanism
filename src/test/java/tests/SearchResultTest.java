package tests;

import org.testng.annotations.Test;

import common.BaseTest;
import pages.SearchResultPage;

public class SearchResultTest extends BaseTest {
	@Test(retryAnalyzer = common.RetryAnalyzer.class)
	public void searchResult() {
		SearchResultPage obj=new SearchResultPage(driver);
		validateTitle("Gmail - Google Search0");
		obj.clickSearchResult();
		validateTitle("Gmail - Email from Google");

	}

}
