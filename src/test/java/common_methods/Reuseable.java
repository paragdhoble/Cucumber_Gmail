package common_methods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Reuseable  {



    public void TakeScreenShot(WebDriver driver) throws IOException {

        String screenshot_name = System.currentTimeMillis() + ".png";
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,  new File("C:\\Parag\\ScreenShots"+screenshot_name));      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)
    }

}
