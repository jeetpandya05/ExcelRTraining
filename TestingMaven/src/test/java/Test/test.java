package Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		Thread.sleep(3000);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		name.click();
		name.sendKeys("lisa");
		Thread.sleep(3000);
		
		WebElement list = driver.findElement(By.xpath("//div[@role='listbox']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(list);
		hover.click().build().perform();
		
		
	//	driver.findElement(By.xpath("div[@role='listbox']")).click();
		
		//link.sendKeys(Keys.ARROW_DOWN);
		//link.sendKeys(Keys.ENTER);
		//link.click();
	}
}
