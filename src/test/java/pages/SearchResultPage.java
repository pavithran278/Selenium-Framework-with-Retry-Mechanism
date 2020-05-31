package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

	private WebDriver driver;
	@FindBy (xpath="//h3[.='Gmail by Google']")
	WebElement GmailLink;
	
	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSearchResult() {
		GmailLink.click();
	}

}
