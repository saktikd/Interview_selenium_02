package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Write_Code_for_Login {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.get("http://webapp.qedgetech.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		
		Thread.sleep(3000);
		driver.quit();

		
		
		
		
		
		
	}

}
