package XMLtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {

	@Test (groups = "smoke")
	public void Hover() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//1. Hover Example
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement kids = driver.findElement(By.xpath("//a[@class='desktop-main'][@data-group='kids']"));
		
		Actions hover = new Actions(driver);
		hover.moveToElement(kids).perform();
		
		//2. Hover Example
		driver.navigate().to("https://vctcpune.com/selenium/practice.html#serviceid");
				
		WebElement hover2 = driver.findElement(By.id("mousehover"));
		hover.scrollToElement(hover2);
		hover.moveToElement(hover2).build().perform();
		
		Thread.sleep(3000);
		
		//3. Hover Example
		driver.navigate().to("https://www.amazon.in");
		
		WebElement hover3 = driver.findElement(By.xpath("//a[text()='Facebook']"));
		hover.scrollToElement(hover3).perform();
	
		Thread.sleep(3000);
		hover3.click();
		
		
	}
}
