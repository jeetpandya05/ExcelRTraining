package Module2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Windows {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		String Window = driver.getWindowHandle();
		driver.switchTo().window(Window);
		driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
		
		
	}

}
