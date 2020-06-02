package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;

import java.io.FileNotFoundException;

public class GmailTest extends BaseTest {
    @Test
    public void Gmail(){

        test=report.startTest("GmailTest","Test is for opening GMail from Google search and validating the title");
        Assert.assertEquals(new GoogleHomePage(driver)
                        .searchWithKeyword("Gmail")
                        .clickSearchResult().getTitle(),
                "Gmail - Email from Google");

    }
}
