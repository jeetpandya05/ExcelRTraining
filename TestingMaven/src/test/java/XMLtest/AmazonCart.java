package XMLtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonCart {

	@Test (groups = "smoke")
	public void AmazonaddtoCart() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 13 Pro (128GB) - Graphite")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[normalize-space()='1TB']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Gold']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		driver.quit();

		
	}

}
