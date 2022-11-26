package base.OHRM;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;

	public void initialization() throws IOException {
		configFilepath();
		browsertype();
		openURL();
			
	}
	
	public void browsertype() {
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {			//chrome driver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {		//firefox driver
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("safari")) {		//safari driver
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}	
	}
	
	public void configFilepath() throws IOException {
		String configpath = "./src/main/java/config/config.properties";
		FileInputStream file = new FileInputStream(configpath);				//input file details into code
		prop = new Properties();
		prop.load(file);
	}
	
	public void openURL() {
		driver.get(prop.getProperty("url"));								//getting url through properties
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void captureScreenshot(String testcaseName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;						
		File file = ss.getScreenshotAs(OutputType.FILE);					//taking screenshot
		String fileName = "./Screenshot/" + testcaseName + ".png";			//storing with name and type for screenshot
		FileUtils.copyFile(file, new File(fileName));						//copying in Screenshot folder
	}
	
	public void browserQuit() {
		driver.quit();
	}
}