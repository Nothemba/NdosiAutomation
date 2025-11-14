package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;

public class TakeScreenShoots
{
    private static final String screenshotDir = System.getProperty("user.dir") +"/screenshots";

    public void takeScreenShot(WebDriver driver, String screenshotName){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotDir, screenshotName + ".jpeg");
        try {
            Files.copy(src.toPath(), destination.toPath());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
