package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		//Check Box
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption2")).click();
		
		//Radio Button
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();
		
		
		//Displayed Function
		System.out.println("Radio button 3 is Displayed: "
													+ driver.findElement(By.xpath("//input[@value='Radio1']")).isDisplayed());
		
		//Enabled Function
		System.out.println("Radio button 3 is Enabled: "
													+ driver.findElement(By.xpath("//input[@value='Radio1']")).isEnabled());
		
		//Selected Function
		System.out.println("Radio button 3 is Selected: "
													+ driver.findElement(By.xpath("//input[@value='Radio1']")).isSelected());
		
		
		driver.quit();
		
		
	}

}
