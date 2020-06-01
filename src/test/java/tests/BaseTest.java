package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	public static WebDriver driver;
	public static String Chrome_Driver_path = "D:\\chromedriver.exe";
	public static ExtentTest test;
	public static ExtentReports report;

	@BeforeSuite
	public void beforeSuite() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	}

	@BeforeMethod
	public void beforeMethod() {
		//Setting system Property
		System.setProperty("webdriver.chrome.driver", Chrome_Driver_path);
		//Opening Chrome browser
		driver= new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName()+" Test Failed ");
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName()+" Test Passed ");
		}
		else {
			test.log(LogStatus.SKIP, result.getName()+" Test Skipped ");
		}

		report.endTest(test);
		driver.close();
	}
	@AfterSuite
	public void afterSuite() {
		report.flush();
		driver.quit();
	}

}
