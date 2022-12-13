package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handled_different_X_Path_Expressions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		
	//  Here we see different x-path expression for a link of gmail in google page	
		
	//	driver.get("https://google.com");
		
	//	driver.findElement(By.xpath("//a[text()='Gmail']")).click();               
		
	//	driver.findElement(By.xpath("//*[@class='gb_d']")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		
		
		
		driver.get("https://Freecrm.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@href='https://api.freecrm.com/register/']")).click();
		
	//	driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		
		
		
	//  Here for button we can use the x-path expression like below
		
	//	"//button[@type='button' and @class='btn']"          we can use multiple attributes values
		
	//	"//button[contains(text(),'Sign Up')]"
		
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
