package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultPage extends BasePage {

	private WebDriver driver;
	@FindBy (xpath="//h3[.='Google Mail - Gmail']")
	WebElement gmailLink;
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public BasePage clickSearchResult() {
		gmailLink.click();
		return new BasePage(driver);
	}

}
