package tests;

import org.testng.annotations.Test;

import common.BaseTest;
import pages.GoogleHomePage;

public class GoogleHomeTest extends BaseTest {
	@Test(retryAnalyzer = common.RetryAnalyzer.class)
	public void GoogleHome() {
		GoogleHomePage obj = new GoogleHomePage(driver);
		validateTitle("Google");
		obj.search("Gmail");
		
	}
}
