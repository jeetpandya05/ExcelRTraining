package TestNGMaven;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestVerify {

	@Test
	public void validateTitle() {
		System.out.println("Title Verified");
	}
	
	@Test
	public void validateLogo() {
		System.out.println("Logo Verified");
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
}
