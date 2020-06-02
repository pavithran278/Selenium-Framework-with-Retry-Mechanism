package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ReadConfig;

import java.io.FileNotFoundException;

public class GoogleHomePage extends BasePage {

	private WebDriver driver;
	private  String url = ReadConfig.getValue("test1");
	@FindBy(xpath="//input[@name=\"q\"]")
	WebElement SearchBar;

	public GoogleHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.get(url);
		PageFactory.initElements(driver, this);
	}

	public SearchResultPage searchWithKeyword(String KeyWord) {
		SearchBar.sendKeys(KeyWord+Keys.ENTER);
		return new SearchResultPage(driver);
	}


}
