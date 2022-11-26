package OHRMpages;



import java.io.IOException;

import org.openqa.selenium.By;

import base.OHRM.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public DashboardPage loginTest() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		try {
			captureScreenshot("login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new DashboardPage();
	}
	
	public boolean getLogo() {
		return driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean forgotPassword() {
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		return driver.findElement(By.xpath("//h6[text()='Reset Password']")).isDisplayed();
	}
	
	
}

	
