package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import utils.ReadConfig;

import java.io.FileNotFoundException;

public class GmailTest extends BaseTest {
    @Test
    public void Gmail(){

         String url = ReadConfig.getValue("test1");
        test=report.startTest("GmailTest","Test is for opening GMail from Google search and validating the title");
        Assert.assertEquals(new GoogleHomePage(driver,url)
                        .searchWithKeyword("Gmail")
                        .clickSearchResult().getTitle(),
                "Gmail - Email from Google");

    }
}
