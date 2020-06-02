package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static String getScreenshot(WebDriver driver, String fileName) {
        String destination = System.getProperty("user.dir")+"//Screenshot//"+fileName+".png";
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(file, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  destination;
    }
}
