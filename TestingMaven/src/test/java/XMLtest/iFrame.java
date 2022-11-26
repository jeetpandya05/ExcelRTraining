package XMLtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrame {

	@Test (groups = "regression")
	public void iFram() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tinymce");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mce_0_ifr");		//By "id" value under <iframe> tag
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Jeet Pandya");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[contains(text(),'File')]")).click();
		
	}

}
