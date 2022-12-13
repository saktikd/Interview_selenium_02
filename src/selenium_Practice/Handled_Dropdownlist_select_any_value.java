package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handled_Dropdownlist_select_any_value {

	public static void main(String[] args) {
		
		
        WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.get("http://webapp.qedgetech.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		

		driver.findElement(By.id("mi_a_stock_items")).click();
		driver.findElement(By.xpath("//*[@data-phrase='AddLink']")).click();
		
	
		Select cat = new Select(driver.findElement(By.id("x_Category")));
		cat.selectByIndex(1);
		
	}

}
