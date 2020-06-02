package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ReadConfig;

public class FaceBookPage extends BasePage {

    private WebDriver driver;
    private  String url = ReadConfig.getValue("test2");
    @FindBy(linkText="Create a Page")
    WebElement CreateAPage;

    public FaceBookPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public BasePage ClickCreatePage() {
        CreateAPage.click();
        return new BasePage(driver);
    }
}
