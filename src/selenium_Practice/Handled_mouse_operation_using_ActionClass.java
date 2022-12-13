package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handled_mouse_operation_using_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			
			driver.get("http://webapp.qedgetech.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("master");
			driver.findElement(By.id("btnsubmit")).click();
			
			Thread.sleep(2000);
			
	     	Actions act = new Actions(driver);
		    act.moveToElement(driver.findElement(By.id("mi_a_stock_items")));
	    	act.build().perform();
	    	
	    	Thread.sleep(2000);
		
	    	driver.findElement(By.id("mi_a_stock_categories")).click();
		
	}

}
