package selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Write_Code_for_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://google.com");
		
        TakesScreenshot ts = (TakesScreenshot)driver;
		
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File trgfile = new File("C:\\Users\\HP\\Desktop\\scrnsht11.jpg"); //scrnsht11.jpg is the image name & file type
		FileUtils.copyFile(srcfile, trgfile);                             //C:\\Users\\HP\\Desktop is the file location where our image would be stored
		
		
		
		
		
		
	}

}
