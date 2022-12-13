package selenium_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handled_Robot_class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.get("https://google.com");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
	//	robot.keyRelease(KeyEvent.VK_TAB);
	//	Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
	}

}
