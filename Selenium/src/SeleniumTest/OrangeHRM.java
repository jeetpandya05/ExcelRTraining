package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Path for ChromeDriver
		System.setProperty("webdriver.chrome.driver", 
				"/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		
		//Assign driver for ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//Open the URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait for URL to load(3sec)
		Thread.sleep(3000);

		//Enter Username
		WebElement username = driver.findElement(By.name("username"));	//method 1
		username.sendKeys("Admin");
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("admin123");	//method 2
		
		//Select Login button
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//Close
		driver.close();
		
	}

}
