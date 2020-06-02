package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FaceBookPage;

public class FaceBookTest extends BaseTest {
    @Test
    public void FaceBook() {

        test=report.startTest("FaceBookTest","Test is for opening FaceBook and validating the title");

        Assert.assertEquals(new FaceBookPage(driver)
                        .ClickCreatePage()
                        .getTitle(),
                "Gmail - Email from Google");

    }

}
