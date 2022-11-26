package TestNGMaven;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsDemo {

	//Priority Annotations
	@Test (priority = 1)
	public void alpha() {
		System.out.println("Alpha");
	}
	
	@Test (priority = 2)		//0 is default priority
	public void bravo() {
		System.out.println("Bravo");
	}
	
	//DependsOn Annotations
	@Test (dependsOnMethods = "alpha")
	public void charlie() {
		System.out.println("Charlie");
	}
	
	//Assert Attribute
	@Test
	public void titlelogo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle);			//AssertEquals attribute
		
		boolean logoDisplayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		Assert.assertTrue(logoDisplayed);					//AssertTrue attribute
		driver.quit();
	}
	
	
	
}
