package selenium_Practice;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handled_Brokenlinks_on_parallel_mode {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.firefoxdriver().create();
		
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		
		
		
		
	}

}
