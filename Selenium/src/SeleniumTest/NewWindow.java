package SeleniumTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("windowButton")).click();
		System.out.println(driver.getTitle());
		System.out.println("Main Window ID: " + driver.getWindowHandle());

		
		//New TAB
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		System.out.println("Tab Window ID: " + driver.getWindowHandle());


		
		//New WINDOW
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("New Window ID: " + driver.getWindowHandle());

		
		//Multiple handles
		Set<String> handles = driver.getWindowHandles();
		for (String s : handles) {
			driver.switchTo().window(s);
			System.out.println("Title is: " + driver.getTitle());
		}
		
		driver.quit();
		
		
		
		
	}

}
