package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoogleHomePage extends BasePage {

	private WebDriver driver;
	@FindBy(xpath="//input[@name=\"q\"]")
	WebElement SearchBar;

	public GoogleHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		driver.get("https://www.google.com/");
		PageFactory.initElements(driver, this);
	}

	public SearchResultPage searchWithKeyword(String KeyWord) {
		SearchBar.sendKeys(KeyWord+Keys.ENTER);
		return new SearchResultPage(driver);
	}


}
