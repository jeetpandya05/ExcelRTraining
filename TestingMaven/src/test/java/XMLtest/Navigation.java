package XMLtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {

	@Test (groups = "regression")
	public void Nav() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		//Simple For-loop
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText());
			System.out.println(link.get(i).getAttribute("title"));
		}
		
		//Complex For-loop
		for (WebElement l : link) {
			System.out.println(l.getText());
		}
		
		driver.close();
	}
}