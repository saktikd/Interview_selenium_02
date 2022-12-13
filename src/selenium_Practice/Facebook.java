package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("dhalsaktikanta20@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sakti26199408");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
	//	driver.findElement(By.xpath("//*[@placeholder='Search Facebook' and @type='search']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Search Facebook' and @type='search']")).sendKeys("narendra");
		
		
		
		
	
	}

}
