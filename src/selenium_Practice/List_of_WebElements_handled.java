package selenium_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_of_WebElements_handled {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		WebDriver driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.Flipkart.com");
		
		List <WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Links Present are ="+linkslist.size());
		
		for(int i=0;i<linkslist.size();i++)
		{
			String linktext = linkslist.get(i).getText();
			System.out.println(linktext);
		}
		
		driver.quit();
		
		
		
		
	}

}
