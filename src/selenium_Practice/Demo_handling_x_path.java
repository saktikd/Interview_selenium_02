package selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_handling_x_path {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.get("https://Freecrm.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dhalsakti@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sakti12345");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		driver.findElement(By.className("item-text")).click();
		
		driver.findElement(By.xpath("//*[@class='users icon']")).click();
	
	//	Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
