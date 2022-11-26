package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/jeetpandya/Desktop/TESTAPPS/SeleniumDrivers/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
		driver.manage().window().maximize();
		
		//Select class
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		//Select Option
			//1. select by Value
			dropdown.selectByValue("option1");
				
			//2. select by Index
			dropdown.selectByIndex(1);
				
			//3. select by VisibleText
			dropdown.selectByVisibleText("Option1");
				
		
		//Find options present in dropdown menu
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		
		
		//Print all Options 
		for (WebElement d : options) {
			System.out.println("The values are: "+ d.getText());	
		}
		
		
		//Multi Select old
		driver.navigate().to("https://demoqa.com/select-menu");
		Select multi = new Select(driver.findElement(By.id("cars")));
		
		multi.selectByIndex(0);
		multi.selectByIndex(2);
		
		multi.deselectByIndex(0);
		multi.deselectByIndex(2);
		
		
		//Bootstrap Multi Select  **not working yet**
		WebElement colour = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]"));
		colour.click();
		colour.sendKeys("g");
		colour.sendKeys(Keys.ENTER);
		colour.sendKeys("b");
		colour.sendKeys(Keys.ARROW_DOWN);
		colour.sendKeys(Keys.ENTER);
		

	}

}
