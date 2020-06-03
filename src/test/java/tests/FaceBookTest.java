package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FaceBookPage;
import utils.ReadConfig;

public class FaceBookTest extends BaseTest {

    @Test
    public void FaceBook() {
        String url = ReadConfig.getValue("test2");

        test = report.startTest("FaceBookTest", "Test is for opening FaceBook and validating the title");

        Assert.assertEquals(new FaceBookPage(driver, url)
                        .ClickCreatePage()
                        .getTitle(),
                "Gmail - Email from Google");

    }

}
