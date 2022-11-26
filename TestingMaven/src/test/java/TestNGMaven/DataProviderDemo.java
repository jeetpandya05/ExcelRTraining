package TestNGMaven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	@Test (dataProvider = "loginExcelData")
	public void loginTest(String uname, String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.quit();
	}

	@DataProvider
	public Object[][] loginData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "admin";
		data[0][1] = "admin123";
		
		data[1][0] = "hr";
		data[1][1] = "hr123";
		
		data[2][0] = "finance";
		data[2][1] = "finance123";
		
		return data;
	}
	
	@DataProvider (name = "loginExcelData")
	public  Object[][] getLoginDataFromExcel() throws IOException {
		ExcelReaderadv obj = new ExcelReaderadv();
		return obj.getData();
		
	}
	
	
	
}
