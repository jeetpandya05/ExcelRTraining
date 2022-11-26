package OHRMpages.leave;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.OHRM.BaseClass;

public class AssignLeave extends BaseClass{
	
	public void assignLeave() {
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		name.click();
		name.sendKeys("lisa");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement list = driver.findElement(By.xpath("//div[@role='listbox']"));
		Actions hover = new Actions(driver);
		hover.moveToElement(list);
		hover.click().build().perform();
		
		
		
		
	}
	
}
