package common;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	public static String Chrome_Driver_path = "D:\\chromedriver.exe";
	@BeforeSuite
	public void beforeSuite() {
		//Setting system Property
		System.setProperty("webdriver.chrome.driver", Chrome_Driver_path);
		//Opening Chrome browser
		driver= new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@AfterSuite
	public void afterSuite() {
		driver.close();
	}

	public void validateTitle(String ExpectedTitle) {
		assertEquals(driver.getTitle(), ExpectedTitle);
	}
}
