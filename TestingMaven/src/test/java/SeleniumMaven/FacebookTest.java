package SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {

	@Test
	public void FB() {
		
		//1st option to configure driver (Driver download)
		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		
		//2nd option to configure driver (Maven Dependency)
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
	}

}
