package Operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class BaseClass 
{
	  public static WebDriver getWebDriver()
	  { 
		  
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amann\\Drivers\\chromedriver_win32\\chromedriver.exe"); 
		    
		WebDriver driver = new ChromeDriver();
		    
		driver.get("https://www.calculator.net/");
		    
		driver.manage().window().maximize();
	  
		return driver;
	  
	  }
}
