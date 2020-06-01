package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FaceBookPage;
import pages.GoogleHomePage;
import pages.SearchResultPage;

public class FaceBookTest extends BaseTest {
    @Test(retryAnalyzer = utils.RetryAnalyzer.class)
    public void FaceBook() {

        test=report.startTest("FaceBookTest","Test is for opening FaceBook and validating the title");

        Assert.assertEquals(new FaceBookPage(driver)
                        .ClickCreatePage()
                        .getTitle(),
                "Gmail - Email from Google");

    }

}
