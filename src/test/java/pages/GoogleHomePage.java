package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	private WebDriver driver;
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	WebElement SearchBar;

	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void search(String KeyWord) {
		SearchBar.sendKeys(KeyWord+Keys.ENTER);
	}


}
