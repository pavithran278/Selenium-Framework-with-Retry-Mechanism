package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import utils.CaptureScreenshot;

import java.io.IOException;

public class BaseTest {
	public static WebDriver driver;
	public static String Chrome_Driver_path = "D:\\chromedriver.exe";
	public static ExtentTest test;
	public static ExtentReports report;

	@BeforeSuite
	public void beforeSuite() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\Report\\ExtentReportResults.html");
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
	public void getResult(ITestResult result) throws IOException {
		String screenshotPath = CaptureScreenshot.getScreenshot(driver,result.getName());
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getName()+" Test Failed ");
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName()+" Test Passed ");
			test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		}
		else {
			test.log(LogStatus.SKIP, result.getName()+" Test Skipped ");
//			test.log(LogStatus.SKIP, test.addScreenCapture(screenshotPath));
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
